package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		

	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setResizable(false);
	window.setTitle("Presente do Yan");
	
	GamePanel gamePanel = new GamePanel();
	window.add(gamePanel);
	
	window.pack();
	
	window.setLocationRelativeTo(null);
	window.setVisible(true);
	//para abrir uma janela
	
	gamePanel.startGameThread();
	
	
	}

}
