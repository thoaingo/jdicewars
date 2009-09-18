package gui.panel;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;

import app.AppContext;

@SuppressWarnings("serial")
public class BoardPanel extends CommonPanel {

	public BoardPanel(Container containerContainer) {
		super(containerContainer);
	}

	protected void initComponents() {
		add(new JLabel("Board"));
	}

	protected void initEvents() {
		// TODO implement
	}

	public void setVisible(boolean aFlag) {
		super.setVisible(aFlag);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		if (AppContext.getContext().isGameAlive()) {
			AppContext.getContext().drawField(g2d, this.getSize());
			AppContext.getContext().fillField(g2d, this.getSize());
		}
	}
	
}
