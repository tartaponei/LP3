package br.com.livraria.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAutor;
	private String nome;
	private String sobrenome;
	private String biografia;
	
	
	public Autor() {
		super();
		
	}

	public Autor(int idAutor, String nome, String sobrenome, String biografia) {
		super();
		this.idAutor = idAutor;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.biografia = biografia;
	}


	public int getIdAutor() {
		return idAutor;
	}


	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getBiografia() {
		return biografia;
	}


	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	

	
	
	
}
