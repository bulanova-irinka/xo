package xogame.controller;

import xogame.model.Player;

public class Game {

    private static final String gameName = "XO";

    private Player[] players;

    public String getGameName () {
        return gameName;
    }

    public Player currentPlayer() {
        return null;
    }

    public boolean move(final int x, final int y) {
        return false;
    }

    public Player[] getPlayers() {
        return players;
    }
}
