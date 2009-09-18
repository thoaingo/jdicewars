package gui.panel;

import java.awt.Container;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ScorePanel extends CommonPanel {

	public ScorePanel(Container parentContainer) {
		super(parentContainer);
	}

	protected void initComponents() {
		add(new JLabel("Score"));
		
	}

	protected void initEvents() {
		// TODO implement
	}
	
}
