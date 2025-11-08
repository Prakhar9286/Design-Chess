package models;

import models.pieceType.*;

public class Board {
    private Cell[][] board;

    Board() {
        board = new Cell[8][8];
        for(int i = 0; i<8; i++) {
            for(int j = 0; j<8; j++) {
                board[i][j] = new Cell(i, j);
            }
        }

        setPieces();
    }

    private void setPieces() {
        for(int j = 0; j<8; j++) {
            board[1][j].setPiece(new Pawn(ColorType.WHITE));
            board[6][j].setPiece(new Pawn(ColorType.BLACK));
        }

        board[0][0].setPiece(new Elephant(ColorType.WHITE));
        board[0][7].setPiece(new Elephant(ColorType.WHITE));
        board[7][0].setPiece(new Elephant(ColorType.BLACK));
        board[7][7].setPiece(new Elephant(ColorType.BLACK));

        board[0][1].setPiece(new Horse(ColorType.WHITE));
        board[0][6].setPiece(new Horse(ColorType.WHITE));
        board[7][1].setPiece(new Horse(ColorType.BLACK));
        board[7][6].setPiece(new Horse(ColorType.BLACK));

        board[0][2].setPiece(new Camel(ColorType.WHITE));
        board[0][5].setPiece(new Camel(ColorType.WHITE));
        board[7][2].setPiece(new Camel(ColorType.BLACK));
        board[7][5].setPiece(new Camel(ColorType.BLACK));

        board[0][3].setPiece(new Queen(ColorType.WHITE));
        board[7][3].setPiece(new Queen(ColorType.BLACK));

        board[0][4].setPiece(new King(ColorType.WHITE));
        board[7][4].setPiece(new King(ColorType.BLACK));
    }

    public Cell getPiece(Cell cell) {
        return board[cell.getRow()][cell.getCol()];
    }

    public Boolean makeMoveIfPossible(Move move) {
        Cell from = move.getFrom(), to = move.getTo();
        Piece piece = from.getPiece();

        if(piece == null || !piece.checkIfValidMoveForPiece(this, from, to)) {
            return false;
        }

        board[to.getRow()][to.getCol()].setPiece(piece);
        board[from.getRow()][from.getCol()].setPiece(null);

        return true;
    }

}
