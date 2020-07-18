package br.com.vuttr.apirest.controller.dto;

import br.com.vuttr.apirest.modelo.Tag;

public class TagDto {

	private Long id;
	private String descricao;

	public TagDto(Tag tag) {
		this.id = tag.getId();
		this.descricao = tag.getDescricao();
	}

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

}
