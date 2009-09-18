package gui;

import gui.panel.CommonPanel;
import gui.panel.GamePanel;
import gui.panel.HelloPanel;
import gui.panel.HelpPanel;
import gui.panel.OptionsPanel;

import java.awt.CardLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ContainerPanel extends JPanel {

	public final static String HELLO_PANEL = "Hello Panel";
	public final static String OPTIONS_PANEL = "Options Panel";
	public final static String HELP_PANEL = "Help Panel";
	public final static String GAME_PANEL = "Game Panel";
	
	private CommonPanel helloPanel;
	private CommonPanel gamePanel;
	private CommonPanel optionsPanel;
	private CommonPanel helpPanel;
	
	public ContainerPanel() {
		initComponents();
		initEvents();
	}

	private void initComponents() {
		helloPanel = new HelloPanel(this);
		gamePanel = new GamePanel(this);
		optionsPanel = new OptionsPanel(this);
		helpPanel = new HelpPanel(this); 
        
        setLayout(new CardLayout());
        add(helloPanel, HELLO_PANEL);
        add(gamePanel, GAME_PANEL);
        add(optionsPanel, OPTIONS_PANEL);
        add(helpPanel, HELP_PANEL);
		
	}

	private void initEvents() {
		// TODO implement
	}
}
