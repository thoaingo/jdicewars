package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import model.Player;

@SuppressWarnings("serial")
public class AppContext {

	enum GameState {
		STARTED,
		STOPPED,
		PAUSED
	}

	private static List<Color> colors = new ArrayList<Color>() {{
		add(Color.RED);
		add(Color.GREEN);
		add(Color.BLUE);
		add(Color.CYAN);
		add(Color.ORANGE);
	}};

	private static AppContext context;
	private static Dimension size = new Dimension(640, 480);
	private List<Player> players = new ArrayList<Player>();
	private FieldDrawer fieldDrawer;
	private FieldFiller fieldFiller;

	private GameState gameState;

	private AppContext() {
		fieldDrawer = new FieldDrawer(size);
		fieldFiller = new FieldFiller(size);

		setPlayersCount(2);
		gameState = GameState.STOPPED;
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

	public void startGame() {
		this.gameState = GameState.STARTED;
	}

	public void stopGame() {
		this.gameState = GameState.STOPPED;
	}

	public void pauseGame() {
		this.gameState = GameState.PAUSED;
	}

	public boolean isGameAlive() {
		return GameState.STARTED.equals(this.gameState);
	}

	public void setPlayersCount(int count) {
		players.clear();
		for (int i = 0; i < count; i++) {
			Player pl = new Player(colors.get(i));
			players.add(pl);
		}
	}
}
