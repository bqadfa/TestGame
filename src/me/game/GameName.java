package me.game;

import javax.swing.*;
import java.awt.Canvas;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameName extends Canvas implements Runnable {

    public static final String TITLE = "Endava Adventures";
    public static final int WIDTH = 640;
    public static final int HEIGHT = WIDTH / 4 * 3;

    private void stop() {
        System.exit(0);
    }

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        GameName game = new GameName();
        JFrame frame = new JFrame(TITLE);
        frame.add(game);
        frame.setSize(WIDTH, HEIGHT);
        frame.setResizable(false); // unable to resize window
        frame.setFocusable(true); // ables to use keyboard and mouse
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.err.println("Exiting the game.");
                game.stop();
            }
        });
        frame.setLocationRelativeTo(null); // popping up window in the centre of our monitor
        frame.setVisible(true); // shows up the window
        frame.requestFocus();
    }
}
