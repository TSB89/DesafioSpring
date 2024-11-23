package desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import desafio.entity.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}
