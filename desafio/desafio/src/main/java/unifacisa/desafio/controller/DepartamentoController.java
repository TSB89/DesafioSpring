package unifacisa.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unifacisa.desafio.model.Departamento;
import unifacisa.desafio.repository.DepartamentoRepository;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @PostMapping
    public Departamento criarDepartamento(@RequestBody Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @GetMapping("/{id}")
    public Departamento obterDepartamento(@PathVariable Long id) {
        return departamentoRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Departamento> listarDepartamentos() {
        return departamentoRepository.findAll();
    
    }
}
