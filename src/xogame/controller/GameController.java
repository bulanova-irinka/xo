package xogame.controller;

import xogame.model.Board;
import xogame.model.Figure;
import xogame.model.Player;

public class GameController {

    private static final String gameName = "XO";

    private Player[] players = new Player [] {
            new Player ("Max", new Figure ("X")),
            new Player ("Ivan", new Figure ("O"))
    };

    private final Board board = new Board();

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

    public Board getBoard(){
        return board;
    }
}
