package BrickBreakerGame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	static boolean left, right;

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) left = true;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) right = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) left = false;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) right = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {}
}
