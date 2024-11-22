package unifacisa.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unifacisa.desafio.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}
