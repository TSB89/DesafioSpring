package desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import desafio.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
