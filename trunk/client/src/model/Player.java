package model;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

public class Player {
	
	private Color color;
	private Set<HexagonArea> playerAreas = new HashSet<HexagonArea>();
	
	public Player(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public Set<HexagonArea> getPlayerAreas() {
		return playerAreas;
	}
	
	public void addPlayerArea(HexagonArea area) {
		playerAreas.add(area);
		area.setPlayer(this);
	}

	public void setPlayerAreas(Set<HexagonArea> playerAreas) {
		this.playerAreas = playerAreas;
	}

}
