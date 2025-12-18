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


public class LevelSelection extends JPanel implements ActionListener {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	final int originalTileSize = 16;
	final int scale = 3;
	final int tilesize = originalTileSize * scale;
	final int maxScreenCol = 16;
	final int maxScreenRow = 12;
	final int screenwidth = maxScreenCol * tilesize;
	final int screenheight = maxScreenRow * tilesize;

	BrickBreakerGame.PixelButtons level1, level2, level3;
	private JFrame window;
	static String selectedTheme = "default";

	public LevelSelection(JFrame window, int i) {

		this.window = window;
		this.setPreferredSize(new Dimension(screenwidth, screenheight));
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);

		if (i == 1 || i == 0) {
			this.setBackground(new Color(59, 47, 47));
			level1 = new PixelButtons("Level 1", new Color(210, 180, 140));
			level2 = new PixelButtons("Level 2", new Color(210, 180, 140));
			level3 = new PixelButtons("Back", new Color(210, 180, 140));
		} else if (i == 2) {
			this.setBackground(new Color(135, 206, 250));
			level1 = new PixelButtons("Level 1", new Color(230, 157, 184));
			level2 = new PixelButtons("Level 2", new Color(255, 210, 199));
			level3 = new PixelButtons("Back", new Color(254, 236, 206));
		}

		level1.addActionListener(this);
		level2.addActionListener(this);
		level3.addActionListener(this);
		gbc.gridy = 0;
		add(level1, gbc);
		gbc.gridy = 1;
		add(level2, gbc);
		gbc.gridy = 2;
		add(level3, gbc);
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		window.getContentPane().removeAll();

		if (e.getSource() == level1 || e.getSource() == level2) {
			window.add(new GamePanel());
		} else if (e.getSource() == level3) { // Back
			window.add(new MainMenu(window));
		}

		window.revalidate();
		window.repaint();
	}
}
