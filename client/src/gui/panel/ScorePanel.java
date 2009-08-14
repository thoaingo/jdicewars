package gui.panel;

import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ScorePanel extends JPanel {

	private Container parentContainer;
	
	public ScorePanel(Container parentContainer) {
		this.parentContainer = parentContainer;
		initComponents();
		initEvents();
	}

	private void initComponents() {
		add(new JLabel("Score"));
		
	}

	private void initEvents() {
		// TODO Auto-generated method stub
		
	}
	
	public Container getParentContainer() {
		return parentContainer;
	}
}
