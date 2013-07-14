package com.dots;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * User: Captain Jack
 * Date: 13.07.13 14:08
 */
public class GameFrame {

    private final GameField gameField;
    private final GameInfoPanel gameInfoPanel;
    private JFrame form;

    public GameFrame(DotsGame.GameWindowListener gameWindowListener) {
        form = new JFrame("Dots Of War 0.1a");
        form.addWindowListener(gameWindowListener);
        form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
        form.setResizable(false);

        gameField = new GameField(600, 600, 30);
        form.getContentPane().add(gameField);

        gameInfoPanel = new GameInfoPanel(200, 600);
        form.getContentPane().add(gameInfoPanel);

        this.toString();
    }

    public void show() {
        form.pack();
        form.setVisible(true);
    }

    class GameField extends JPanel {

        private int width;
        private int height;
        private int gridStep;

        public GameField(int width, int height, int gridStep) {
            this.width = width;
            this.height = height;
            setPreferredSize(new Dimension(width, height));
            if (gridStep <= 0) gridStep = 10;
            this.gridStep = gridStep;
            setBackground(new Color(255, 255, 230));
            this.setBorder(new LineBorder(Color.RED));
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            paintGrid(g);
        }

        private void paintGrid(Graphics g) {
            g.setColor(Color.gray);
            int numberOfCellsX = width / gridStep;
            int numberOfCellsY = height / gridStep;
            for (int i = 0; i < numberOfCellsX; i++) {
                g.drawLine(i * gridStep, 0, i * gridStep, (numberOfCellsY - 1) * gridStep);
            }
            for (int i = 0; i < numberOfCellsY; i++) {
                g.drawLine(0, i * gridStep, (numberOfCellsX - 1) * gridStep, i * gridStep);
            }
        }
    }

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
}
