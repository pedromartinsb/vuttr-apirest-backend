package br.com.vuttr.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.vuttr.apirest.modelo.Ferramenta;

public interface FerramentaRepository extends JpaRepository<Ferramenta, Long> {

	List<Ferramenta> findByNome(String nomeFerramenta);
	
	@Query("SELECT f FROM Ferramenta f WHERE f.nome = :nomeFerramenta")
	List<Ferramenta> carregarPorNomeDaFerramenta(@Param("nomeFerramenta") String nomeFerramenta);

}
