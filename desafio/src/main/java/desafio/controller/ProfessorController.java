package desafio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.entity.Professor;
import desafio.service.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
	private final ProfessorService service;

	public ProfessorController(ProfessorService service) {
		this.service = service;
	}

	@GetMapping
	public List<Professor> getAll() {
		return service.getAll();
	}

	@PostMapping
	public Professor save(@RequestBody Professor professor) {
		return service.save(professor);
	}
}
