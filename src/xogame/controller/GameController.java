package xogame.controller;

import xogame.model.Board;
import xogame.model.Player;

public class GameController {

    private static final String gameName = "XO";

    private final Board board;

    public GameController(Board board) {
        this.board = board;
    }

    private Player[] players = new Player [] {
            //new Player ("Max", new Figure ("f1")),
           // new Player ("Ivan", new Figure ("f2"))
    };

    public String getGameName () {
        return gameName;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Board getBoard(){
        return board;
    }
}
