package xogame.model;

public class Board {

    private final int SIZE_FIELD = 9;

    private Figure[] figures = new Figure [SIZE_FIELD];

    public void initArray() {
       figures[0] = new Figure ("X");
       figures[1] = new Figure ("O");
    }

    public void showBoard () {

        System.out.println ("Hey");
    }


}
