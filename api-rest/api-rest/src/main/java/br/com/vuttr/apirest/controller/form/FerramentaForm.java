package br.com.vuttr.apirest.controller.form;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import br.com.vuttr.apirest.modelo.Ferramenta;
import br.com.vuttr.apirest.modelo.Tag;

public class FerramentaForm {

	@NotEmpty @Length(min = 5)
	private String nome;
	
	@NotEmpty @Length(min = 10)
	private String descricao;
	
	@NotEmpty
	private String links;
	
	private List<Tag> tags = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLinks() {
		return links;
	}

	public void setLinks(String links) {
		this.links = links;
	}

	public Ferramenta converter() {
		return new Ferramenta(nome, descricao, links);
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

}
