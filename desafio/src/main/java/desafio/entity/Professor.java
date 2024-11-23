package desafio.entity;

import jakarta.persistence.*;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    // toString
    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", departamento=" + (departamento != null ? departamento.getNome() : "null") +
                '}';
    }
}
