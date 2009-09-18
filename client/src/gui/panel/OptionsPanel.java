package gui.panel;

import java.awt.Container;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class OptionsPanel extends CommonPanel {

	public OptionsPanel(Container parentContainer) {
		super(parentContainer);
	}

	protected void initComponents() {
		add(new JLabel("Options here"));
	}

	protected void initEvents() {
		// TODO implement
	}

}
