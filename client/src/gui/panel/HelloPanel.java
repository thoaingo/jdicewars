package gui.panel;

import gui.ContainerPanel;
import gui.listener.CommonActionListener;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import util.ImageUtils;

@SuppressWarnings("serial")
public class HelloPanel extends CommonPanel {

	private static final String imageUrl = "/images/logo.jpg";

	private ActionListener commonActionListener;

	private JPanel buttonsPanel;
	private ImageIcon logo;
	private JButton btStart;
	private JButton btOptions;

	public HelloPanel(Container parentContainer) {
		super(parentContainer);
	}

	protected void initComponents() {
		setLayout(new BorderLayout());

		buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		logo = ImageUtils.createImageIcon(imageUrl);
		btStart = new JButton("Start");
		btOptions = new JButton("Options");

		buttonsPanel.add(btStart);
		buttonsPanel.add(btOptions);

		add(new JLabel(logo), BorderLayout.NORTH);
		add(buttonsPanel, BorderLayout.SOUTH);
	}

	protected void initEvents() {
		commonActionListener = new CommonActionListener(parentContainer);
		
		btStart.setActionCommand(ContainerPanel.GAME_PANEL);
		btOptions.setActionCommand(ContainerPanel.OPTIONS_PANEL);
		
		btStart.addActionListener(commonActionListener);
		btOptions.addActionListener(commonActionListener);
	}

}
