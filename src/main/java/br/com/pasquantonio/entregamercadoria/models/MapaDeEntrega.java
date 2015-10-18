package br.com.pasquantonio.entregamercadoria.models;


public class MapaDeEntrega {
	private Long id;

	private String nome;
	
	private Vertex vertice;


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


	public Vertex getVertice() {
		return vertice;
	}


	public void setVertice(Vertex vertice) {
		this.vertice = vertice;
	}
}
