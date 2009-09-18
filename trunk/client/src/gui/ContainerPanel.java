package gui;

import gui.panel.GamePanel;
import gui.panel.HelloPanel;

import java.awt.CardLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ContainerPanel extends JPanel {

	public final static String HELLO_PANEL = "Hello Panel";
	public final static String OPTIONS_PANEL = "Options Panel";
	public final static String HELP_PANEL = "Help Panel";
	public final static String GAME_PANEL = "Game Panel";
	
	private JPanel helloPanel;
	private JPanel gamePanel;
	
	public ContainerPanel() {
		initComponents();
		initEvents();
	}

	private void initComponents() {
		helloPanel = new HelloPanel(this);
		gamePanel = new GamePanel(this);
        
        setLayout(new CardLayout());
        add(helloPanel, HELLO_PANEL);
        add(gamePanel, GAME_PANEL);
		
	}

	private void initEvents() {
		// TODO implement
	}
}
