package com.heitor.pdfgenerator.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Estudante implements Serializable, Comparable<Estudante> {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
    private String nome;
    private String sobreNome;
    private LocalDate aniversario;
    private String nacionalidade;
    private String universidade;
    private Boolean ativo;
    
    public Estudante() {
    }

	public Estudante(Integer id, String nome, String sobreNome, LocalDate aniversario, String nacionalidade, String universidade, Boolean ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.aniversario = aniversario;
		this.nacionalidade = nacionalidade;
		this.universidade = universidade;
		this.ativo = ativo;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public LocalDate getAniversario() {
		return aniversario;
	}

	public void setAniversario(LocalDate aniversario) {
		this.aniversario = aniversario;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivi(Boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudante other = (Estudante) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int compareTo(Estudante outro) {
		return getNome().compareTo(outro.getNome());
	}
}