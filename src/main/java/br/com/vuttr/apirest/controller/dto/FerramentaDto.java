package br.com.vuttr.apirest.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.lang.NonNull;

import br.com.vuttr.apirest.modelo.Ferramenta;

public class FerramentaDto {

	@NonNull
	private Long id;
	private String nome;
	private String descricao;
	private String links;
	
	public FerramentaDto(Ferramenta ferramenta) {
		this.id = ferramenta.getId();
		this.nome = ferramenta.getNome();
		this.descricao = ferramenta.getDescricao();
		this.links = ferramenta.getLinks();
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

	public static List<FerramentaDto> converter(List<Ferramenta> ferramentas) {
		return ferramentas.stream().map(FerramentaDto::new).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

}
