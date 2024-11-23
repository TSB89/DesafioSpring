package desafio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.entity.Aluno;
import desafio.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	private final AlunoService service;

	public AlunoController(AlunoService service) {
		this.service = service;
	}

	@GetMapping
	public List<Aluno> getAll() {
		return service.getAll();
	}

	@PostMapping
	public Aluno save(@RequestBody Aluno aluno) {
		return service.save(aluno);
	}
}
