package br.com.livraria.modelo;

public enum CategoriasLivro {
	
	
	
	INFANTIL("Infantil"),
	INFANTO("Infanto Juvenil"),
	LITERATURA("Literatura Brasileira");
	
	private String descricao;
	
	CategoriasLivro(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
