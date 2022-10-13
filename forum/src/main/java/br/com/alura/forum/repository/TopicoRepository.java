package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByCursoNome(String nomeCurso);

	// Para alterar a mensagem para o português
//		@Query(" SELECT t FROM topico t WHERE t. curso.nome = :nomeCurso")
//		List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);
}
