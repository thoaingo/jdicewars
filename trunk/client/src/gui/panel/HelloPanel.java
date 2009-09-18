package gui.panel;

import java.awt.Container;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class HelloPanel extends CommonPanel {

	public HelloPanel(Container parentContainer) {
		super(parentContainer);
	}

	protected void initComponents() {
		add(new JLabel("Hello"));
	}

	protected void initEvents() {
		// TODO implement
	}

}
