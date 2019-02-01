package xogame.model;

public class Figure {

    private final String figure;

    public Figure (final String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;

    }

    @Override
    public java.lang.String toString() {
        return this.figure;
    }
}
