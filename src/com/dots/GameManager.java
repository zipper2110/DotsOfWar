package com.dots;

import java.util.logging.Logger;

/**
 * GameManager is base platform for running game, it is game independent and allows to run different games
 *
 * @author Captain Jack
 * @since 12.07.13 20:43
 */
public class GameManager {

    private Game game;
    private Logger logger = Logger.getLogger(GameManager.class.getName());

    public GameManager() {
        game = new DotsGame();
    }

    /**
     * starts the game
     */
    public void startGame() {
        game.start();
        logger.info("GameManager started");
    }
}
