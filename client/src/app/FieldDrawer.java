package app;

import java.awt.Graphics2D;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JPanel;

import model.Hexagon;

public class FieldDrawer {

	private JPanel panel;
	private int width;
	private int height;
	private Set<Hexagon> field = new HashSet<Hexagon>();
	
	public FieldDrawer(JPanel panel) {
		this.panel = panel;
	}

	public void draw(Graphics2D g2d) {
		System.out.println("draw");
		width = panel.getWidth();
		height = panel.getHeight();
		
		int offset = 0;
		for (int y = 0; y < height; y += 15) {
			for (int x = 0; x < width; x += 20) {
				Hexagon h = new Hexagon(x + offset, y);
				field.add(h);
				g2d.draw(h.getHexagon());
			}
			offset = 10 - offset;
		}
		
		System.out.println(field.size());
	}
	
	
}
