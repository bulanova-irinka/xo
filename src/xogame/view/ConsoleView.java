package xogame.view;

import xogame.controller.GameController;

public class ConsoleView {

    private final GameController gameController = new GameController();


    public void showGameName(GameController gameController) {
        System.out.println(gameController.getGameName());
    }

    public void showPlayersName(GameController gameControler) {
        System.out.println(gameControler.getPlayers());
    }

    public void showBoardLine() {
        int i=0;
        for (i=0; i<3; i += 1) {
            System.out.println(gameController.getBoard().getFigures(0,i));
        }
    }


}
