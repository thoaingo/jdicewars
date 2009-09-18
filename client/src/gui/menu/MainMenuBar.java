package gui.menu;

import java.awt.Container;
import java.awt.event.ActionListener;

import gui.ContainerPanel;
import gui.listener.ExitActionListener;
import gui.listener.CommonActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import util.MessageBundle;

@SuppressWarnings("serial")
public class MainMenuBar extends JMenuBar {

	private Container containerPanel;
	private ActionListener menuActionListener;
	private ActionListener exitActionListener;
	
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
		menuGame = new JMenu(MessageBundle.get("menu.game"));
		menuHelp = new JMenu(MessageBundle.get("menu.help"));
		
		itemStart = new JMenuItem(MessageBundle.get("menu.game.start"));
		itemOptions = new JMenuItem(MessageBundle.get("menu.game.options"));
		itemExit = new JMenuItem(MessageBundle.get("menu.game.exit"));
		itemHelp = new JMenuItem(MessageBundle.get("menu.help.help"));
		itemAbout = new JMenuItem(MessageBundle.get("menu.help.about"));
		
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
		menuActionListener = new CommonActionListener(containerPanel);
		exitActionListener = new ExitActionListener();
		
		itemStart.setActionCommand(ContainerPanel.GAME_PANEL);
		itemOptions.setActionCommand(ContainerPanel.OPTIONS_PANEL);
		itemHelp.setActionCommand(ContainerPanel.HELP_PANEL);
		
		itemStart.addActionListener(menuActionListener);
		itemOptions.addActionListener(menuActionListener);
		itemHelp.addActionListener(menuActionListener);
		itemExit.addActionListener(exitActionListener);
	}
}
