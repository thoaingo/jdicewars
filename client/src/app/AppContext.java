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
		Player pl3 = new Player(Color.YELLOW);
		//Player pl4 = new Player(Color.GREEN);
		players.add(pl1);
		players.add(pl2);
		players.add(pl3);
		//players.add(pl4);
	}
	
	@Deprecated
	public static AppContext getContext(JPanel panel) {
		size = panel.getSize();
		if (context == null) {
			context = new AppContext();
		}
		return context;
	}
	
	public static AppContext getContext() {
		if (context == null) {
			context = new AppContext();
		}
		return context;
	}
	
	public void drawField(Graphics2D g2d, Dimension newSize) {
		fieldDrawer.draw(g2d, newSize);
	}
	
	public void fillField(Graphics2D g2d, Dimension newSize) {
		fieldFiller.fill(g2d, players, newSize);
	}
	
	public FieldDrawer getDrawer () {
		return fieldDrawer;
	}
	
	public FieldFiller getFiller() {
		return fieldFiller;
	}
}
