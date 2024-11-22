package unifacisa.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unifacisa.desafio.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
