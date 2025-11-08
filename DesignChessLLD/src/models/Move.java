package models;

public class Move {
    private Cell to;
    private Cell from;

    public Cell getTo() {
        return to;
    }

    public void setTo(Cell to) {
        this.to = to;
    }

    public Cell getFrom() {
        return from;
    }

    public void setFrom(Cell from) {
        this.from = from;
    }
}
