package desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import desafio.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
