package gui.panel;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;

import app.AppContext;

@SuppressWarnings("serial")
public class BoardPanel extends AbstractPanel {

	public BoardPanel(Container containerContainer) {
		super(containerContainer);
	}

	protected void initComponents() {
		add(new JLabel("Board"));
	}

	protected void initEvents() {
		// TODO implement
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		AppContext.getContext(this).drawField(g2d, this.getSize());
		AppContext.getContext(this).fillField(g2d, this.getSize());
	}
	
}
