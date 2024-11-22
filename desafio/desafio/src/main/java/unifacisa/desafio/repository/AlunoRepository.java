package unifacisa.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unifacisa.desafio.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
