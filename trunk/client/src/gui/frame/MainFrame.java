package gui.frame;

import gui.ContainerPanel;
import gui.menu.MainMenuBar;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import util.MessageBundle;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	private JMenuBar mainMenu; 
	private JPanel containerPanel;
	
	public MainFrame() {
		super(MessageBundle.get("mainframe.title"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        containerPanel = new ContainerPanel();
        mainMenu = new MainMenuBar(containerPanel);
        
        getContentPane().add(containerPanel);
        setJMenuBar(mainMenu);
        
        setSize(640, 480);
        setLocationRelativeTo(null);	
	}
}
