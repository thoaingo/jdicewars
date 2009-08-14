package gui.panel;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {

	private Container parentContainer;
	private JPanel boardPanel;
    private JPanel scorePanel;
	
	public GamePanel(Container parentContainer) {
		this.parentContainer = parentContainer;
		initComponents();
		initEvents();
	}

	private void initComponents() {
		setLayout(new BorderLayout());
		
		boardPanel = new BoardPanel(parentContainer);
		scorePanel = new ScorePanel(parentContainer);
		
		add(boardPanel, BorderLayout.CENTER);
		add(scorePanel, BorderLayout.SOUTH);
		
	}

	private void initEvents() {
		// TODO Auto-generated method stub
		
	}
}
