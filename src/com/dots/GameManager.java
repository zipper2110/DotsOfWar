package com.dots;

import java.util.logging.Logger;

/**
 * User: Captain Jack
 * Date: 12.07.13 20:43
 */
public class GameManager {

    Game game;

    public GameManager() {
        game = new Game();
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
}
