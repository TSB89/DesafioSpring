package unifacisa.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import unifacisa.desafio.model.Curso;
import unifacisa.desafio.repository.CursoRepository;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    public Curso criarCurso(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }

    @GetMapping("/{id}")
    public Curso obterCurso(@PathVariable Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    @PutMapping("/{id}")
    public Curso atualizarCurso(@PathVariable Long id, @RequestBody Curso cursoAtualizado) {
        return cursoRepository.findById(id).map(curso -> {
            curso.setNome(cursoAtualizado.getNome());
            curso.setProfessores(cursoAtualizado.getProfessores());
            curso.setAlunos(cursoAtualizado.getAlunos());
            return cursoRepository.save(curso);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletarCurso(@PathVariable Long id) {
        cursoRepository.deleteById(id);
    }
}
