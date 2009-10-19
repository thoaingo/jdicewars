package gui.panel;

import gui.ContainerPanel;
import gui.listener.ChangePlayersCountListener;
import gui.listener.CommonActionListener;
import gui.listener.StartGameListener;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import app.AppContext;

import util.ImageUtils;

@SuppressWarnings("serial")
public class HelloPanel extends CommonPanel {

	private static final String imageUrl = "/images/logo.jpg";

	private ActionListener commonActionListener;
	private ActionListener startGameListener;
	private ItemListener changePlayersCountListener;

	private JPanel topPanel;
	private JPanel bottomPanel;
	private JPanel playersPanel;
	private JPanel buttonsPanel;
	private ImageIcon imgLogo;
	private JComboBox cbPlayers;
	private JButton btStart;
	private JButton btOptions;

	private Vector<String> playersVector;

	public HelloPanel(Container parentContainer) {
		super(parentContainer);
	}

	protected void initComponents() {
		imgLogo = ImageUtils.createImageIcon(imageUrl);
		btStart = new JButton("Start");
		btOptions = new JButton("Options");
		cbPlayers = new JComboBox(getPlayers());

		playersPanel = new JPanel();
		playersPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		playersPanel.add(cbPlayers);

		buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonsPanel.add(btStart);
		buttonsPanel.add(btOptions);

		topPanel = new JPanel();
		topPanel.add(new JLabel(imgLogo));

		bottomPanel = new JPanel(new GridLayout(2, 1));
		bottomPanel.add(playersPanel);
		bottomPanel.add(buttonsPanel);

		setLayout(new BorderLayout());
		add(topPanel, BorderLayout.NORTH);
		add(bottomPanel, BorderLayout.SOUTH);
	}

	private Vector<String> getPlayers() {
		playersVector = new Vector<String>();

		playersVector.add("2 players");
		playersVector.add("3 players");
		playersVector.add("4 players");
		playersVector.add("5 players");

		return playersVector;
	}

	protected void initEvents() {
		commonActionListener = new CommonActionListener(parentContainer);
		startGameListener = new StartGameListener();
		changePlayersCountListener = new ChangePlayersCountListener();

		btStart.setActionCommand(ContainerPanel.GAME_PANEL);
		btOptions.setActionCommand(ContainerPanel.OPTIONS_PANEL);
		cbPlayers.addItemListener(changePlayersCountListener);

		btStart.addActionListener(commonActionListener);
		btStart.addActionListener(startGameListener);
		btOptions.addActionListener(commonActionListener);
		
		AppContext.getContext().setPlayersCount(cbPlayers.getSelectedIndex() + 2);

	}

}
