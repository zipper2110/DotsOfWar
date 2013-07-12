package com.dots;

import java.util.logging.Logger;

/**
 * User: Captain Jack
 * Date: 13.07.13 0:33
 */
public class Game {

    Logger logger = Logger.getLogger(this.getClass().getName());

    public Game() {
        logger.info("Created new game");
    }

    public void start() {
        logger.info("Game started");
    }

    public void stop() {
        logger.info("Game stopped");
    }
}
