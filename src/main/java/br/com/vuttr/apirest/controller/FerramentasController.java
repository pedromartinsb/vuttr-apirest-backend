package br.com.vuttr.apirest.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Cacheable;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.vuttr.apirest.controller.dto.DetalhesDaFerramentaDto;
import br.com.vuttr.apirest.controller.dto.FerramentaDto;
import br.com.vuttr.apirest.controller.form.AtualizacaoFerramentaForm;
import br.com.vuttr.apirest.controller.form.FerramentaForm;
import br.com.vuttr.apirest.modelo.Ferramenta;
import br.com.vuttr.apirest.modelo.Tag;
import br.com.vuttr.apirest.repository.FerramentaRepository;
import br.com.vuttr.apirest.repository.TagRepository;

@RestController
@RequestMapping("/ferramentas")
public class FerramentasController {

	@Autowired
	private FerramentaRepository ferramentaRepository;

	@Autowired
	private TagRepository tagRepository;

	@GetMapping
	@Cacheable(value = "listaDeFerramentas")
	public Page<FerramentaDto> lista(@RequestParam(required = false) String tag,
			@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable paginacao) {

		if (tag == null) {
			Page<Ferramenta> ferramentas = ferramentaRepository.findAll(paginacao);
			return FerramentaDto.converter(ferramentas);

		} else {

			Page<Ferramenta> ferramentas = ferramentaRepository.findByTags_Descricao(tag, paginacao);
			return FerramentaDto.converter(ferramentas);
		}
	}

	@PostMapping
	public ResponseEntity<FerramentaDto> cadastrar(@RequestBody @Valid FerramentaForm form,
			UriComponentsBuilder uriBuilder) {
		Ferramenta ferramenta = form.converter();
		ferramentaRepository.save(ferramenta);

		// criando lista para popular e setar dentro do Objeto Ferramenta
		List<Tag> lstTags = new ArrayList<>();

		for (Tag tagRetorno : form.getTags()) {
			Tag tag = new Tag();
			tag.setDescricao(tagRetorno.getDescricao());
			tag.setFerramenta(ferramenta);
			tagRepository.save(tag);
			lstTags.add(tag);
		}

		// setando a lista de Tags para retorno do método
		ferramenta.setTags(lstTags);

		URI uri = uriBuilder.path("/ferramentas/{id}").buildAndExpand(ferramenta.getId()).toUri();
		return ResponseEntity.created(uri).body(new FerramentaDto(ferramenta));
	}

	@GetMapping("/{id}")
	public ResponseEntity<DetalhesDaFerramentaDto> detalhar(@PathVariable Long id) {
		Optional<Ferramenta> ferramenta = ferramentaRepository.findById(id);
		if (ferramenta.isPresent()) {
			return ResponseEntity.ok(new DetalhesDaFerramentaDto(ferramenta.get()));
		}

		return ResponseEntity.notFound().build();
	}

	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<FerramentaDto> atualizar(@PathVariable Long id,
			@RequestBody @Valid AtualizacaoFerramentaForm form) {
		Optional<Ferramenta> optional = ferramentaRepository.findById(id);
		if (optional.isPresent()) {
			Ferramenta ferramenta = form.atualizar(id, ferramentaRepository);
			return ResponseEntity.ok(new FerramentaDto(ferramenta));
		}

		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> remover(@PathVariable Long id) {
		Optional<Ferramenta> optional = ferramentaRepository.findById(id);
		if (optional.isPresent()) {
			tagRepository.deleteByFerramentaId(id);
			ferramentaRepository.deleteById(id);
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.notFound().build();
	}

}
