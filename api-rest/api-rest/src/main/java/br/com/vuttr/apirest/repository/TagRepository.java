package br.com.vuttr.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vuttr.apirest.modelo.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {

	void deleteByFerramentaId(Long id);

	List<Tag> findByDescricao(String nomeTag);

}
