package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import model.Hexagon;
import model.HexagonArea;
import model.HexagonField;
import model.Player;

public class FieldFiller {

	private static final Logger log = Logger.getLogger(FieldFiller.class.getName());
	private static final int AREA_HEX_COUNT = 6;
	private int width;
	private int height;

	public FieldFiller(Dimension size) {
		this(size.width, size.height);
	}
	
	public FieldFiller(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void fill(Graphics2D g2d, List<Player> players, Dimension newSize) {
		log.info("fill");
		if (!players.isEmpty()) {
//			HexagonField field = AppContext.getContext().getDrawer().getField();
//			for (Hexagon hexagon : field) {
//				if (hexagon.getArea() != null) {
//					g2d.setPaint(hexagon.getArea().getPlayer().getColor());
//					g2d.fill(hexagon.getPath());
//				}
//			}
			
			for(Player player : players) {
				for (HexagonArea area : player.getPlayerAreas()) {
					g2d.setPaint(player.getColor());
					for (Hexagon hexagon : area) {
						g2d.fill(hexagon.getPath());
					}
					g2d.setPaint(Color.BLACK);
					g2d.draw(area.getPath());
				}
			}
		}
	}
}
