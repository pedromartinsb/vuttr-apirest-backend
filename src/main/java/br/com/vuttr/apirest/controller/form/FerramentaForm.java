package br.com.vuttr.apirest.controller.form;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import br.com.vuttr.apirest.modelo.Ferramenta;

public class FerramentaForm {

	@NotEmpty @Length(min = 5)
	private String nome;
	
	@NotEmpty @Length(min = 10)
	private String descricao;
	
	@NotEmpty
	private String links;

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

}
