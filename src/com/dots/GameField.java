package com.dots;

import javax.swing.*;

/**
 * User: Captain Jack
 * Date: 13.07.13 14:08
 */
public class GameField {

    private JFrame form;

    public GameField(DotsGame.GameWindowListener gameWindowListener) {
        form = new JFrame();
        form.addWindowListener(gameWindowListener);
    }

    public void show() {
        form.pack();
        form.setVisible(true);
    }
}
