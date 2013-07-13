package com.dots;

import javax.swing.*;

/**
 * User: Captain Jack
 * Date: 13.07.13 14:08
 */
public class GameField {

    private DotsFrame form;

    public GameField(DotsGame.GameWindowListener gameWindowListener) {
        form = new DotsFrame();
        form.addWindowListener(gameWindowListener);
    }

    public void show() {
        form.pack();
        form.setVisible(true);
    }
}
