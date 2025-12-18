package BrickBreakerGame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class PixelButtons extends JButton {
	private static Font pixelFont;
	static {
		//initializing static variable pixelFont before the creation of class object
		
			pixelFont = new Font("Ariel", Font.BOLD, 18);
		}
	
	public PixelButtons(String text, Color bgColor)
	{
		super(text);// calls JButtons constructor to initialize text and etc. in buttons 
		setFont(pixelFont);
		setForeground(Color.BLACK);
		setBackground(bgColor);
		setFocusPainted(false);//check this with true too
		setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
