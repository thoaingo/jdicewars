package gui.panel;

import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class HelloPanel extends JPanel {

	//private Container parentContainer;
	
	public HelloPanel(Container parentContainer) {
		//this.parentContainer = parentContainer;
		initComponents();
		initEvents();
	}

	private void initComponents() {
		add(new JLabel("Hello"));
		
	}

	private void initEvents() {
		// TODO Auto-generated method stub
		
	}
}
