package desafio.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.entity.Departamento;
import desafio.service.DepartamentoService;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
	private final DepartamentoService service;

	public DepartamentoController(DepartamentoService service) {
		this.service = service;
	}

	@GetMapping
	public List<Departamento> getAll() {
		return service.getAll();
	}

	@PostMapping
	public Departamento save(@RequestBody Departamento departamento) {
		return service.save(departamento);
	}
}
