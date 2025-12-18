package BrickBreakerGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainMenu extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final int originalTileSize=16;
	final int scale = 3;
	final int tilesize= originalTileSize*scale;
	final int maxScreenCol= 16;
	final int maxScreenRow=12;
	final int screenwidth=maxScreenCol*tilesize;
	final int screenheight=maxScreenRow*tilesize;
	
	
	public int choice=0;
	PixelButtons theme1, theme2, play;
	JFrame parentFrame;
	private JFrame window;
	static String selectedTheme= "default"; 
	public MainMenu(JFrame window) {
		this.window=window;
		this.setPreferredSize(new Dimension(screenwidth,screenheight));
		this.setBackground(new Color(135, 206, 250));//sky blue
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc= new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		
		theme1 = new PixelButtons("Theme 1", new Color(230, 157, 184));
		theme2 = new PixelButtons("Theme 2", new Color(255, 210, 199));
		play = new PixelButtons("PLAY", new Color(254, 236, 206));
		
		theme1.addActionListener(this);
		theme2.addActionListener(this);
		play.addActionListener(this);
		
		gbc.gridy = 0;
		add(theme1, gbc);
		gbc.gridy = 1;
		add(theme2, gbc);
		gbc.gridy = 2;
		add(play, gbc);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == theme1)
			{
			selectedTheme = "theme1";
			choice=1;
			}
		else if(e.getSource()== theme2)
			{
			selectedTheme = "theme2";
			choice = 2;
			}
		else if(e.getSource()== play )
		{
			 // Remove MainMenu and show LevelSelection
            window.getContentPane().removeAll();
            window.add(new LevelSelection(window, choice));
            window.revalidate();
            window.repaint();
		}
		
	}

}
