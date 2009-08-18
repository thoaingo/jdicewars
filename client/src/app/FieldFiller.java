package app;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import model.Area;
import model.Hexagon;
import model.HexagonField;
import model.Player;

public class FieldFiller {

	private static final Logger log = Logger.getLogger(FieldFiller.class.getName());
	private static final int AREA_HEX_COUNT = 6;
	private int width;
	private int height;
	private Set<Area> areas = new HashSet<Area>();

	public FieldFiller(Dimension size) {
		this(size.width, size.height);
	}
	
	public FieldFiller(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void fill(Graphics2D g2d, List<Player> players, Dimension newSize) {
		log.info("fill");
		
		HexagonField field = AppContext.getContext().getDrawer().getField();
		int i = 0;
		for (Hexagon hexagon : field) {
			//Set<Hexagon> neighbors = field.findNeighbors(hexagon);
						
			int number = i % players.size();
			g2d.setPaint(players.get(number).getColor());
			i++;
			g2d.fill(hexagon.getPath());
		}
	}
}
