package gui.frame;

import gui.ContainerPanel;
import gui.menu.MainMenuBar;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	public MainFrame() {
		super("JDiceWars");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel containerPanel = new ContainerPanel();
        
        getContentPane().add(containerPanel);
        setJMenuBar(new MainMenuBar(containerPanel));
        
        setSize(640, 480);
        setLocationRelativeTo(null);	
	}
}
