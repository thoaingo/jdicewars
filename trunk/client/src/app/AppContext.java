package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import model.Player;

public class AppContext {

	private static AppContext context;
	private static Dimension size = new Dimension(640, 480);
	private List<Player> players = new ArrayList<Player>();
	private FieldDrawer fieldDrawer;
	private FieldFiller fieldFiller;
	
	private AppContext() {
		fieldDrawer = new FieldDrawer(size);
		fieldFiller = new FieldFiller(size);
		
		Player pl1 = new Player(Color.RED);
		Player pl2 = new Player(Color.BLUE);
		players.add(pl1);
		players.add(pl2);
	}
	
	public static AppContext getContext(JPanel panel) {
		if (context == null) {
			size = panel.getSize();
			context = new AppContext();
		}
		return context;
	}
	
	public void drawField(Graphics2D g2d, Dimension newSize) {
		fieldDrawer.draw(g2d, newSize);
	}
	
	public void fillField(Graphics2D g2d) {
		fieldFiller.fill(g2d, players.size());
	}
}
