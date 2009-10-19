package model;

import java.awt.Point;
import java.awt.geom.GeneralPath;

public class Hexagon {

	private GeneralPath path = new GeneralPath();
	private int[] xPoints = {10, 20, 20, 10, 0, 0};
	private int[] yPoints = {0, 5, 15, 20, 15, 5};
	private int x = 0;
	private int y = 0;
	@Deprecated
	private float xScale = 1;
	@Deprecated
	private float yScale = 1;
	
	// TODO
	private HexagonArea area;
	
	public Hexagon(int x, int y) {
		this.x = x;
		this.y = y;
		
		path.moveTo((xPoints[0] + x) * xScale, (yPoints[0] + y) * yScale);
		for (int i = 1; i < xPoints.length; i++) {
			path.lineTo((xPoints[i] + x) * xScale, (yPoints[i] + y) * yScale);
		}
		path.closePath();
		//return path;
	}
	
	@Deprecated
	public Hexagon(int x, int y, float xScale, float yScale) {
		this.x = x;
		this.y = y;
		this.xScale = xScale;
		this.yScale = yScale;
	}

//	public Shape getHexagon() {
//		path.moveTo((xPoints[0] + x) * xScale, (yPoints[0] + y) * yScale);
//		for (int i = 1; i < xPoints.length; i++) {
//			path.lineTo((xPoints[i] + x) * xScale, (yPoints[i] + y) * yScale);
//		}
//		path.closePath();
//		return path;
//	}
	
	@Deprecated
	public void setScale(float xScale, float yScale) {
		this.xScale = xScale;
		this.yScale = yScale;
	}
	
	public Point getPoint() {
		return new Point(x, y);
	}
	
	public boolean containsPoint(int x, int y) {
		// TODO implement
		return false;
	}
	
	public boolean isNeighbor(Hexagon hexagon) {
		boolean result =
			((this.x == hexagon.x - 20 || this.x == hexagon.x + 20) && this.y == hexagon.y) ||
			((this.x == hexagon.x - 10 || this.x == hexagon.x + 10) && (this.y == hexagon.y + 15 || this.y == hexagon.y - 15));
		return result;
	}
	
	public GeneralPath getPath() {
		return path;
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

	public boolean isFree() {
		return area == null;
	}
	
	public void setArea(HexagonArea area) {
		this.area = area;
	}
	
	public HexagonArea getArea() {
		return area;
	}
	
}
