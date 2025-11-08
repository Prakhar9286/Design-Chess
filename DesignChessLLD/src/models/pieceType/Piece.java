package models.pieceType;

import models.Board;
import models.Cell;
import models.ColorType;
import models.Type;

public abstract class Piece {
    private ColorType color;
    private Type type;

    Piece(Type type, ColorType color) {
        this.type = type;
        this.color = color;
    }

    public abstract Boolean checkIfValidMoveForPiece(Board board, Cell from, Cell to);

    public ColorType getColor() {
        return color;
    }

    public void setColor(ColorType color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
