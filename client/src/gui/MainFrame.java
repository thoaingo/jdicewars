package gui;

import gui.panel.GamePanel;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public MainFrame() {
		super("JDiceWars");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new GamePanel(this);
        
        Container contentPane = getContentPane();
        contentPane.add(mainPanel);
        setSize(640, 480);
        setLocationRelativeTo(null);	
	}
	
	

}
