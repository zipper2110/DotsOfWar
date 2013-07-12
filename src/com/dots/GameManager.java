package com.dots;

import java.util.logging.Logger;

/**
 * User: Captain Jack
 * Date: 12.07.13 20:43
 */
public class GameManager {

    Logger logger = Logger.getLogger(GameManager.class.getName());

    public void startGame() {
        logger.info("GameManager started");
    }

    public void stopGame() {
        logger.info("GameManager stopped");
    }
}
