package br.com.pasquantonio.entregamercadoria.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pasquantonio.entregamercadoria.models.GraphPath;

public interface GraphPathRepository extends JpaRepository<GraphPath, Long> {
	Collection<GraphPath> findByGraphName(String name);
}
