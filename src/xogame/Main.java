package xogame;

import xogame.controller.GameController;
import xogame.model.Board;
import xogame.view.ConsoleView;

public class Main {

    public static void main (String[] arg) {

        final Board board = new Board();

        final GameController gameController = new GameController(board);

        ConsoleView consoleView = new ConsoleView(gameController);

        consoleView.start();

    }
}
