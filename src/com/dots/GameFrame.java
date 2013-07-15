package com.dots;

import javax.swing.*;
import java.awt.*;

/**
 * represents game GUI, creates game window
 *
 * @author Captain Jack
 * @since 13.07.13 14:08
 */
public class GameFrame {

    private final GameField gameField;
    private final GameInfoPanel gameInfoPanel;

    private JFrame form;

    public GameFrame(DotsGame.GameWindowListener gameWindowListener) {
        form = new JFrame("Dots Of War 0.1a");
        form.addWindowListener(gameWindowListener);
        form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        form.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
        form.setResizable(false);

        gameField = new GameField(22, 22, 28);
        form.getContentPane().add(gameField);

        gameInfoPanel = new GameInfoPanel(200, gameField.getPreferredDimension().height);
        form.getContentPane().add(gameInfoPanel);

        this.toString();
    }

    public void show() {
        form.pack();
        form.setVisible(true);
    }
}
