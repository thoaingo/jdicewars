package gui.panel;

import java.awt.Container;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class AbstractPanel extends JPanel {

	protected Container parentContainer;
	
	public AbstractPanel(Container parentContainer) {
		this.parentContainer = parentContainer;
		initComponents();
		initEvents();
	}
	
	protected abstract void initComponents();

	protected abstract void initEvents();
	
	public Container getParentContainer() {
		return parentContainer;
	}
}
