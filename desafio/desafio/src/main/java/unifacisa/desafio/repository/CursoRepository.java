package unifacisa.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unifacisa.desafio.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
