package br.com.pasquantonio.entregamercadoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pasquantonio.entregamercadoria.models.Graph;

public interface GraphRepository extends JpaRepository<Graph, Long> {
	Graph findByGraphName(String graphName);
}
