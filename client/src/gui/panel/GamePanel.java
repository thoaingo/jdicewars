package gui.panel;

import java.awt.Container;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Container container;
	
	public GamePanel(Container container) {
		this.container = container;
	}

	public Container getContainer() {
		return container;
	}
}
