package br.com.livraria.modelo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.NumberFormat;

@Entity
public class LivrariaTudao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLivro;
	private String titulo;
	private String autor;
	private String editora;
	
//	@Enumerated(EnumType.STRING)
//	private CategoriasLivro categoria;
	private String categoria;
	private String isbn;
	private String capa;
	
	@NumberFormat(pattern = "#,##0.00")
	private double preco;
	
	public LivrariaTudao(){
		
	}
		
	public LivrariaTudao(int idLivro, String titulo, String autor, String editora, String categoria, String isbn,
			String capa, double preco) {
		super();
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.categoria = categoria;
		this.isbn = isbn;
		this.capa = capa;
		this.preco = preco;
	}




	public int getIdLivro() {
		return idLivro;
	}
	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getCapa() {
		return capa;
	}
	public void setCapa(String capa) {
		this.capa = capa;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
	
	

}
