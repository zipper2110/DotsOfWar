package com.dots;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Logger;

/**
 * the most outer game class, represents the game itself
 *
 * @author Captain Jack
 * @since 13.07.13 0:33
 */
public class DotsGame implements Game {

    private Logger logger = Logger.getLogger(this.getClass().getName());
    private GameFrame gameFrame;

    public DotsGame() {
        this.gameFrame = new GameFrame(new GameWindowListener());
        logger.info("Created new game");
    }

    @Override
    public void start() {
        this.gameFrame.show();
        logger.info("Game started");
    }

    @Override
    public void stop() {
        logger.info("Game stopped");
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    public class GameWindowListener extends WindowAdapter {
        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {
            stop();
        }

        @Override
        public void windowIconified(WindowEvent e) {
            pause();
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            resume();
        }
    }
}
