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
	private double xScale = 1;
	private double yScale = 1;
	
	public Hexagon(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Hexagon(int x, int y, double xScale, double yScale) {
		this.x = x;
		this.y = y;
		this.xScale = xScale;
		this.yScale = yScale;
	}

	public Shape getHexagon() {
		hexagon.moveTo((xPoints[0] + x) * xScale, (yPoints[0] + y) * yScale);
		for (int i = 1; i < xPoints.length; i++) {
			hexagon.lineTo((xPoints[i] + x) * xScale, (yPoints[i] + y) * yScale);
		}
		hexagon.closePath();
		return hexagon;
	}
	
	public Point getPoint() {
		return new Point(x, y);
	}
	
	public boolean containsPoint(int x, int y) {
		// TODO implement
		return false;
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
