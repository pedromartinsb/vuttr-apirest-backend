package br.com.vuttr.apirest.controller.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.vuttr.apirest.modelo.Ferramenta;

public class DetalhesDaFerramentaDto {

	private Long id;
	private String nome;
	private String descricao;
	private String links;
	private List<TagDto> tags;

	public DetalhesDaFerramentaDto(Ferramenta ferramenta) {
		this.id = ferramenta.getId();
		this.nome = ferramenta.getNome();
		this.descricao = ferramenta.getDescricao();
		this.links = ferramenta.getLinks();
		this.tags = new ArrayList<>();
		tags.addAll(ferramenta.getTags().stream().map(TagDto::new).collect(Collectors.toList()));
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getLinks() {
		return links;
	}

	public List<TagDto> getTags() {
		return tags;
	}

}
