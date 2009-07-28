package app;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import model.Hexagon;

public class FieldDrawer {

	private static Logger log = Logger.getLogger(FieldDrawer.class.getName());
	private int width;
	private int height;
	private Set<Hexagon> field = new HashSet<Hexagon>();
	
	public FieldDrawer(Dimension size) {
		this(size.width, size.height);
	}
	
	public FieldDrawer(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void draw(Graphics2D g2d) {
		log.info("draw");
		
		int offset = 0;
		for (int y = 0; y < height; y += 15) {
			for (int x = 0; x < width; x += 20) {
				Hexagon h = new Hexagon(x + offset, y);
				field.add(h);
				g2d.draw(h.getHexagon());
			}
			offset = 10 - offset;
		}
		
		log.info(String.valueOf(field.size()));
	}
	
	
}
