package desafio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import desafio.entity.Professor;
import desafio.repository.ProfessorRepository;

@Service
public class ProfessorService {
	private final ProfessorRepository repository;

	public ProfessorService(ProfessorRepository repository) {
		this.repository = repository;
	}

	public List<Professor> getAll() {
		return repository.findAll();
	}

	public Professor save(Professor professor) {
		return repository.save(professor);
	}
}
