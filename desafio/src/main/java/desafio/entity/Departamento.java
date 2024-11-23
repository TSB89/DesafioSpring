package desafio.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	@OneToOne
	@JoinColumn(name = "chefe_id")
	private Professor chefe;

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

	public Professor getChefe() {
		return chefe;
	}

	public void setChefe(Professor chefe) {
		this.chefe = chefe;
	}

	@Override
	public String toString() {
		return "Departamento{" + "id=" + id + ", nome='" + nome + '\'' + ", chefe="
				+ (chefe != null ? chefe.getNome() : "null") + '}';
	}
}
