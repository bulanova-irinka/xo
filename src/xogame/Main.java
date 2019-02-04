package xogame;

import xogame.model.Board;
import xogame.view.ConsoleView;

public class Main {

    public static void main (String[] arg) {
        ConsoleView consoleView = new ConsoleView();

        Board board = new Board();
        board.initArray();
        consoleView.showBoardLine();

    }
}
