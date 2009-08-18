package model;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class HexagonField extends HashSet<Hexagon> { 
	
	public Set<Hexagon> findNeighbors(Hexagon hexagon) {
		Set<Hexagon> neighbors = new HashSet<Hexagon>(); 
		for (Hexagon h : this) {
			if (hexagon.isNeighbor(h)) {
				neighbors.add(h);
			}
		}
		return neighbors;
	}
}
