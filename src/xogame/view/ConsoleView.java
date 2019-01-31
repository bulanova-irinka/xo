package xogame.view;

import xogame.controller.Game;

public class ConsoleView {

    private final Game game;

    public ConsoleView(Game game) {
        this.game = game;
    }

    public void showGameName(Game game) {
        System.out.println(game.getGameName());
    }

    public void showPlayersName(Game game) {
        System.out.println(game.getPlayers());
    }
}
