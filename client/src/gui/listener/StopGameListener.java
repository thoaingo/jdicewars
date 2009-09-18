package gui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.AppContext;

public class StopGameListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		AppContext.getContext().stopGame();
	}

}
