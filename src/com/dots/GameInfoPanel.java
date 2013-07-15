package com.dots;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * @author Captain Jack
 * @since 15.07.13
 */
class GameInfoPanel extends JPanel {

    private int width;
    private int height;

    public GameInfoPanel(int width, int height) {
        this.width = width;
        this.height = height;
        setPreferredSize(new Dimension(width, height));
        this.add(new JLabel("Game Info Here"));
        this.setBorder(new LineBorder(Color.black));
    }

}