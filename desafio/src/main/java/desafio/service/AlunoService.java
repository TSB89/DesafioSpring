package desafio.service;

import java.util.List;

import org.springframework.stereotype.Service;

import desafio.entity.Aluno;
import desafio.repository.AlunoRepository;

@Service
public class AlunoService {
	private final AlunoRepository repository;

	public AlunoService(AlunoRepository repository) {
		this.repository = repository;
	}

	public List<Aluno> getAll() {
		return repository.findAll();
	}

	public Aluno save(Aluno aluno) {
		return repository.save(aluno);
	}
}
