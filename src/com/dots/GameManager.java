package com.dots;

import java.util.logging.Logger;

/**
 * User: Captain Jack
 * Date: 12.07.13 20:43
 * GameManager is base platform for running game, it is game independent and allows to run different games
 */
public class GameManager {

    private Game game;

    public GameManager() {
        game = new DotsGame();
    }

    Logger logger = Logger.getLogger(GameManager.class.getName());

    public void startGame() {
        game.start();
        logger.info("GameManager started");
    }

    public void stopGame() {
        game.stop();
        logger.info("GameManager stopped");
    }

    public void pauseGame() {

    }

    public void unpauseGame() {

    }
}
