package xogame.view;

import xogame.controller.GameController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleView {

    private final GameController gameController;

    private static final Scanner IN = new Scanner(System.in);

    public ConsoleView(GameController gameController) {
        this.gameController = gameController;
    }

    public void start (){
        System.out.println("Please input coordinates:");
        int x = getCoordinate("X");
        int y = getCoordinate("Y");
    }

    public void showBoar () {
        for (int i=0; i<3; i+=1) {
            showBoardLine (i);
        }
    }
    public void showBoardLine (int row) {
        for (int i = 0; i < 3; i += 1) {
            System.out.print(gameController.getBoard().getFigures(row, i));
        }
        System.out.println("");
        System.out.println("------------");
        }

     public int getCoordinate (String coordinateName) {
        System.out.print(String.format("Input the coordinate %s:", coordinateName));
                try {
                    return IN.nextInt();
                }
                catch (final InputMismatchException e) {
                    System.out.println("Coordinate is incorrect");
                    return -1;

         }
     }
    /*public void showGameName(GameController gameController) {
        System.out.println(gameController.getGameName());
    }*/

  /*  public void showPlayersName(GameController gameControler) {
        System.out.println(gameControler.getPlayers());/
    }

   /* public void showBoardLine(int row) {
        int i=0;
        for (i=0; i<3; i += 1) {
            System.out.println(gameController.getBoard().getFigures (row,i));
        }*/




}
