package br.com.livraria.modelo;

public abstract class Livro {
	
	private int idLivro;
	private String titulo;
	private Autor autor;
	private Editora editora;
	private Categoria categoria;
	private String isbn;
	private String capa;
	private double preco;
	
	public Livro() {
		super();
	}


	public Livro(int idLivro, String titulo, Autor autor, Editora editora, Categoria categoria, String isbn,
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


	public int getAutor() {
		return autor.getIdAutor();
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	public int getEditora() {
		return editora.getIdEditora();
	}


	public void setEditora(Editora editora) {
		this.editora = editora;
	}


	public int getCategoria() {
		return categoria.getIdCategoria();
	}


	public void setCategoria(Categoria categoria) {
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
