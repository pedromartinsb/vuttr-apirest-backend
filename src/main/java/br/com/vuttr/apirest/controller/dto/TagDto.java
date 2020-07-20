package br.com.vuttr.apirest.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.vuttr.apirest.modelo.Tag;

public class TagDto {

	private String descricao;

	public TagDto(Tag tag) {
		this.descricao = tag.getDescricao();
	}

	public String getDescricao() {
		return descricao;
	}

	public static List<TagDto> converter(List<Tag> tags) {
		return tags.stream().map(TagDto::new).collect(Collectors.toList());
	}

}
