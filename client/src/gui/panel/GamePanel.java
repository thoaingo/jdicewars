package gui.panel;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.JPanel;

import app.AppContext;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {

	private Container parentContainer;
	
	public GamePanel(Container containerContainer) {
		this.parentContainer = containerContainer;
		initComponents();
		initEvents();
	}

	private void initComponents() {
		add(new JLabel("Game"));
		setMinimumSize(new Dimension(640, 480));
		
	}

	private void initEvents() {
		// TODO Auto-generated method stub
		
	}

	public Container getParentContainer() {
		return parentContainer;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		AppContext.getContext().drawField(g2d);
	}
	
}
