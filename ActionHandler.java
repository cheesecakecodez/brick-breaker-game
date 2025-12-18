package BrickBreakerGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	GamePanel gamePanel;

	public ActionHandler(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		gamePanel.updateGame();
		gamePanel.repaint();
	}
}
