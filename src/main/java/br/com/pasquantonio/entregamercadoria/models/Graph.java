package br.com.pasquantonio.entregamercadoria.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Graph {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String name;
	
	@OneToMany(targetEntity=GraphPath.class)
	private List<GraphPath> graphPath;


	public List<GraphPath> getGraphPath() {
		return graphPath;
	}


	public void setGraphPath(List<GraphPath> graphPath) {
		this.graphPath = graphPath;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return name;
	}


	public void setNome(String nome) {
		this.name = nome;
	}


}
