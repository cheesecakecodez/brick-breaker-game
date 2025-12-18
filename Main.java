package BrickBreakerGame;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window= new JFrame();
		window.setTitle("Brick Breaker Game");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		MainMenu mainMenu= new MainMenu(window);
		window.add(mainMenu);
		window.pack();
		window.setVisible(true);
		
	}

}
