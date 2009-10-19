package app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.JPanel;

import model.Hexagon;
import model.HexagonArea;
import model.HexagonField;
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

		setPlayersCount(0);
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
		initRandomPlayerHexagons();
	}

	private void initRandomPlayerHexagons() {
		int playersCount = players.size();
		int hexsInAreaMaxCount = 6;
		int areasForPlayerCount = fieldDrawer.getFieldSize() / playersCount / hexsInAreaMaxCount;
		HexagonField field = fieldDrawer.getField();
		
		for (int i = 0; i < playersCount; i++) {
			Player player = players.get(i);
			
			for (int j = 0; j < areasForPlayerCount; j++) {
				HexagonArea hexArea = new HexagonArea();
				
				int hexInAreaCount = 0;
				Iterator<Hexagon> fieldIterator = field.iterator();
				while (field.iterator().hasNext() && hexInAreaCount < hexsInAreaMaxCount) {
					Hexagon hex = fieldIterator.next();
					
					if (hex.isFree()) {
						hexArea.add(hex);
						hexInAreaCount++;
					}
					
					Set<Hexagon> hexNeighbors = field.findNeighbors(hex);
					Iterator<Hexagon> nIterator = hexNeighbors.iterator();
					while (nIterator.hasNext() && hexInAreaCount < hexsInAreaMaxCount) {
						Hexagon nHex = fieldIterator.next();
						if (nHex.isFree()) {
							hexArea.add(nHex);
							hexInAreaCount++;
						}
					}
				}
				
				player.addPlayerArea(hexArea);
			}
			
		}
		
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
