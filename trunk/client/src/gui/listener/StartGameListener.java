package gui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.AppContext;

public class StartGameListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		AppContext.getContext().startGame();
	}

}
