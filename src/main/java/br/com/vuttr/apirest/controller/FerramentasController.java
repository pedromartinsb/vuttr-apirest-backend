package br.com.vuttr.apirest.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.vuttr.apirest.controller.dto.FerramentaDto;
import br.com.vuttr.apirest.controller.form.FerramentaForm;
import br.com.vuttr.apirest.modelo.Ferramenta;
import br.com.vuttr.apirest.repository.FerramentaRepository;

@RestController
@RequestMapping("/ferramentas")
public class FerramentasController {

	@Autowired
	private FerramentaRepository ferramentaRepository;

	@GetMapping
	public List<FerramentaDto> lista(String nomeFerramenta) {

		if (nomeFerramenta == null) {
			List<Ferramenta> ferramentas = ferramentaRepository.findAll();
			return FerramentaDto.converter(ferramentas);

		} else {

			List<Ferramenta> ferramentas = ferramentaRepository.findByNome(nomeFerramenta);
			return FerramentaDto.converter(ferramentas);
		}
	}

	@PostMapping
	public ResponseEntity<FerramentaDto> cadastrar(@RequestBody @Valid FerramentaForm form, UriComponentsBuilder uriBuilder) {
		Ferramenta ferramenta = form.converter();
		ferramentaRepository.save(ferramenta);

		URI uri = uriBuilder.path("/ferramentas/{id}").buildAndExpand(ferramenta.getId()).toUri();
		return ResponseEntity.created(uri).body(new FerramentaDto(ferramenta));
	}

}
