package desafio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import desafio.entity.Departamento;
import desafio.repository.DepartamentoRepository;

@Service
public class DepartamentoService {
	private final DepartamentoRepository repository;

	public DepartamentoService(DepartamentoRepository repository) {
		this.repository = repository;
	}

	public List<Departamento> getAll() {
		return repository.findAll();
	}

	public Departamento save(Departamento departamento) {
		return repository.save(departamento);
	}
}
