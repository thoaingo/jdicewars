package gui.menu;

import java.awt.Container;

import gui.ContainerPanel;
import gui.listener.ExitActionListener;
import gui.listener.StartActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MainMenuBar extends JMenuBar {

	private Container containerPanel;
	
	private JMenu menuGame;
	private JMenu menuHelp;
	private JMenuItem itemStart;
	private JMenuItem itemOptions;
	private JMenuItem itemExit;
	private JMenuItem itemHelp;
	private JMenuItem itemAbout;
	
	public MainMenuBar(Container containerPanel) {
		this.containerPanel = containerPanel;
		initComponents();
		initEvents();
	}

	private void initComponents() {
		menuGame = new JMenu("Game");
		menuHelp = new JMenu("Help");
		
		itemStart = new JMenuItem("Start");
		itemOptions = new JMenuItem("Options");
		itemExit = new JMenuItem("Exit");
		itemHelp = new JMenuItem("Help");
		itemAbout = new JMenuItem("About");
		
		menuGame.add(itemStart);
		menuGame.add(itemOptions);
		menuGame.addSeparator();
		menuGame.add(itemExit);
		menuHelp.add(itemHelp);
		menuHelp.add(itemAbout);
		
		add(menuGame);
		add(menuHelp);
	}
	
	private void initEvents() {
		itemStart.setActionCommand(ContainerPanel.GAME_PANEL);
		
		itemExit.addActionListener(new ExitActionListener());
		itemStart.addActionListener(new StartActionListener(containerPanel));
	}
}
