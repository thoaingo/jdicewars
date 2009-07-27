package gui.listener;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartActionListener implements ActionListener {

	private Container parentContainer;
	
	public StartActionListener(Container parentContainer) {
		this.parentContainer = parentContainer;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		CardLayout cl = (CardLayout)(parentContainer.getLayout());
	    cl.show(parentContainer, (String)e.getActionCommand());
	}

}
