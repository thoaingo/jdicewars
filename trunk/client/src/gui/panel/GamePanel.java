package gui.panel;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.JPanel;

import app.FieldDrawer;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {

	private Container parentContainer;
	private FieldDrawer drawer;
	
	public GamePanel(Container containerContainer) {
		this.parentContainer = containerContainer;
		this.drawer = new FieldDrawer(this);
		initComponents();
		initEvents();
	}

	private void initComponents() {
		add(new JLabel("Game"));
		
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
		drawer.draw(g2d);
	}
	
}
