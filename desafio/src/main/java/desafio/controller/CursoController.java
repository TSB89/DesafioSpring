package desafio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.entity.Curso;
import desafio.service.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {
	private final CursoService service;

	public CursoController(CursoService service) {
		this.service = service;
	}

	@GetMapping
	public List<Curso> getAll() {
		return service.getAll();
	}

	@PostMapping
	public Curso save(@RequestBody Curso curso) {
		return service.save(curso);
	}
}
