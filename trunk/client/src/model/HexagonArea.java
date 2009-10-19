package model;

import java.awt.Point;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("serial")
public class HexagonArea extends HashSet<Hexagon> {

	private Player player;
	private GeneralPath path = new GeneralPath();
	
	public boolean add(Hexagon h) {
		boolean result = super.add(h);
		if (result) {
			h.setArea(this);
			appendPath(h);
		}
		return result;
    }

	private void appendPath(Hexagon h) {
		// TODO implement
		path.reset();
		h.getPoint();
		for (Hexagon hex : this) {
			path.append(hex.getPath(), true);		
		}
		path.append(h.getPath(), true);
		path.closePath();
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public GeneralPath getPath() {
		return path;
	}
	
}
