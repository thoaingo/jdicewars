package gui.listener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import app.AppContext;

public class ChangePlayersCountListener implements ItemListener {

	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			AppContext.getContext().setPlayersCount(((JComboBox) e.getSource()).getSelectedIndex() + 2);
		}

	}

}
