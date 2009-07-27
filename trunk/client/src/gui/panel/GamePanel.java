package gui.panel;

import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JPanel;

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
		
	}

	private void initEvents() {
		// TODO Auto-generated method stub
		
	}

	public Container getParentContainer() {
		return parentContainer;
	}
}