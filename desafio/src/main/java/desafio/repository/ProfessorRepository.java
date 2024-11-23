package desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import desafio.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
