package desafio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import desafio.entity.Curso;
import desafio.repository.CursoRepository;

@Service
public class CursoService {
	private final CursoRepository repository;

	public CursoService(CursoRepository repository) {
		this.repository = repository;
	}

	public List<Curso> getAll() {
		return repository.findAll();
	}

	public Curso save(Curso curso) {
		return repository.save(curso);
	}
}
