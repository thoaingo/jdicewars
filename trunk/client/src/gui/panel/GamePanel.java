package gui.panel;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GamePanel extends AbstractPanel {

	private JPanel boardPanel;
    private JPanel scorePanel;
	
	public GamePanel(Container parentContainer) {
		super(parentContainer);
	}

	protected void initComponents() {
		setLayout(new BorderLayout());
		
		boardPanel = new BoardPanel(parentContainer);
		scorePanel = new ScorePanel(parentContainer);
		
		add(boardPanel, BorderLayout.CENTER);
		add(scorePanel, BorderLayout.SOUTH);
		
	}

	protected void initEvents() {
		// TODO implement
		
	}
}
