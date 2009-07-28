package model;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.GeneralPath;

public class Hexagon {

	private GeneralPath hexagon = new GeneralPath();
	private int[] xPoints = {10, 20, 20, 10, 0, 0};
	private int[] yPoints = {0, 5, 15, 20, 15, 5};
	private int x = 0;
	private int y = 0;
	
	public Hexagon(int xOffset, int yOffset) {
		this.x = xOffset;
		this.y = yOffset;
	}

	public Shape getHexagon() {
		hexagon.moveTo(xPoints[0] + x, yPoints[0] + y);
		for (int i = 1; i < xPoints.length; i++) {
			hexagon.lineTo(xPoints[i] + x, yPoints[i] + y);
		}
		hexagon.closePath();
		return hexagon;
	}
	
	public Point getPoint() {
		return new Point(x, y);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Hexagon other = (Hexagon) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	
}
