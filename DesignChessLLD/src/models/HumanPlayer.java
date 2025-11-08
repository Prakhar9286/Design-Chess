package models;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private Status status;

    public HumanPlayer(PlayerType playerType, String color, String name) {
        super(PlayerType.HUMAN_PLAYER, color, name);
    }

    @Override
    public Move makeMove() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please provide the Piece row number you want to Move : ");
        int rowStart = scanner.nextInt();

        System.out.println(" Please provide the Piece col number you want to Move : ");
        int colStart = scanner.nextInt();

        System.out.println(" Please provide the row number for your Piece to move to : ");
        int rowEnd = scanner.nextInt();

        System.out.println(" Please provide the col number for your Piece to move to : ");
        int colEnd = scanner.nextInt();

        Move move = new Move();
        Cell startingCell = new Cell(rowStart, rowEnd);
        Cell endingCell = new Cell(rowEnd, colEnd);
        move.setFrom(startingCell);
        move.setTo(endingCell);

        return move;
    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public void setStatus(Status status) {
        this.status = status;
    }
}
