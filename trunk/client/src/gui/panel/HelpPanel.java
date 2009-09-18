package gui.panel;

import java.awt.Container;

import javax.swing.JLabel;

@SuppressWarnings("serial")
public class HelpPanel extends AbstractPanel {

	public HelpPanel(Container parentContainer) {
		super(parentContainer);
	}

	@Override
	protected void initComponents() {
		add(new JLabel("Help here"));
	}

	@Override
	protected void initEvents() {
		// TODO implement
	}

}
