package br.com.taking.dominio;

public class Livro {
	private Integer isbn;
	private String tipo;
	private String titulo;
	private Double preco;
	
	public Livro(Integer isbn, String tipo, String titulo, Double preco) {
		super();
		this.isbn = isbn;
		this.tipo = tipo;
		this.titulo = titulo;
		this.preco = preco;
		
	}
	
	
	 
	public Integer getIsbn() {
		return isbn;
	}
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	

}
