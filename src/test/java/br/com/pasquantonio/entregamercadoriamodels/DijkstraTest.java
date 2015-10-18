package br.com.pasquantonio.entregamercadoriamodels;

import java.util.List;



import org.junit.Test;

import br.com.pasquantonio.entregamercadoria.models.Dijkstra;
import br.com.pasquantonio.entregamercadoria.models.Edge;
import br.com.pasquantonio.entregamercadoria.models.Vertex;
import static org.junit.Assert.assertEquals;


public class DijkstraTest {

	@Test
	public void deveRetornarMenorCaminhoEntre4Pontos() {
		Vertex A = new Vertex("A");
		Vertex B = new Vertex("B");
		Vertex D = new Vertex("D");
		Vertex F = new Vertex("F");

		A.adjacencies = new Edge[] { new Edge(B, 8) };
		B.adjacencies = new Edge[] { new Edge(D, 11) };
		D.adjacencies = new Edge[] { new Edge(F, 11) };
		F.adjacencies = new Edge[] { new Edge(A, 23) };

		Dijkstra.computePaths(A); // run Dijkstra
		System.out.println("Distance to " + D + ": " + D.minDistance);
		assertEquals(String.valueOf(D.minDistance), "19.0");
		List<Vertex> path = Dijkstra.getShortestPathTo(D);
		System.out.println("Path: " + path);
	}
}
