package unifacisa.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unifacisa.desafio.model.Professor;
import unifacisa.desafio.repository.ProfessorRepository;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @PostMapping
    public Professor criarProfessor(@RequestBody Professor professor) {
        return professorRepository.save(professor);
    }

    @GetMapping("/{id}")
    public Professor obterProfessor(@PathVariable Long id) {
        return professorRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Professor> listarProfessores() {
        return professorRepository.findAll();
    }
}
