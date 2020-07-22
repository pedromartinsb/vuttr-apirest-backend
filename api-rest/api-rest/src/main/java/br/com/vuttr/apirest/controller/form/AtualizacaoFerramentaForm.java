package br.com.vuttr.apirest.controller.form;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import br.com.vuttr.apirest.modelo.Ferramenta;
import br.com.vuttr.apirest.repository.FerramentaRepository;

public class AtualizacaoFerramentaForm {
	
	@NotEmpty @Length(min = 5)
	private String nome;
	
	@NotEmpty @Length(min = 10)
	private String descricao;

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

	public Ferramenta atualizar(Long id, FerramentaRepository ferramentaRepository) {
		Ferramenta ferramenta = ferramentaRepository.getOne(id);
		ferramenta.setNome(this.nome);
		ferramenta.setDescricao(this.descricao);
		
		return ferramenta;
	}

}
