package BrickBreakerGame;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    int paddleX = 350;
    int ballX = 390, ballY = 300;
    int ballDX = 2, ballDY = -2;

    ActionHandler actionHandler;
    KeyHandler keyHandler;

    public GamePanel() {

        setPreferredSize(new Dimension(768, 576));
        setBackground(Color.BLACK);

        keyHandler = new KeyHandler();
        actionHandler = new ActionHandler(this);

        addKeyListener(keyHandler);
        setFocusable(true);

        Timer timer = new Timer(10, actionHandler);
        timer.start();
    }

    public void updateGame() {
        if (KeyHandler.left && paddleX > 0) paddleX -= 5;
        if (KeyHandler.right && paddleX < getWidth() - 100) paddleX += 5;
        ballX += ballDX;
        ballY += ballDY;

        if (ballX <= 0 || ballX >= getWidth() - 20) ballDX *= -1;
        if (ballY <= 0) ballDY *= -1;

        if (ballY >= getHeight()) {
            ballX = 390;
            ballY = 300;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // paddle
        g.setColor(Color.WHITE);
        g.fillRect(paddleX, 520, 100, 10);

        // ball
        g.fillOval(ballX, ballY, 20, 20);
    }
}
