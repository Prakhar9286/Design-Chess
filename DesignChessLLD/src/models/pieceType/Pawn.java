package models.pieceType;

import models.Board;
import models.Cell;
import models.ColorType;
import models.Type;

public class Pawn extends Piece {
    public Pawn(ColorType color) {
        super(Type.PAWN, color);
    }

    @Override
    public Boolean checkIfValidMoveForPiece(Board board, Cell from, Cell to) {
        int rowDiff = to.getRow() - from.getRow();
        int colDiff = Math.abs(from.getCol() - to.getCol());

        if(from.getPiece().getColor() == ColorType.WHITE) {
            return (rowDiff == 1 && colDiff == 0) || (from.getRow() == 1 && rowDiff == 2 && colDiff == 0)
                    || (rowDiff == 1 && colDiff == 1 && board.getPiece(to) != null);
        }

        return (rowDiff == -1 && colDiff == 0) || (from.getRow() == 6 && rowDiff == -2 && colDiff == 0)
                || (rowDiff == -1 && colDiff == 1 && board.getPiece(to) != null);
    }
}
