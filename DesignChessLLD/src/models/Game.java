package models;

import exceptions.InvalidGameException;
import models.pieceType.Piece;

import java.util.ArrayList;
import java.util.List;

import static models.Type.KING;

public class Game {
    private Board board;
    private List<Player> players;
    private int lastPlayerIndex;
    private GameStatus gameStatus;
    private List<Move> moves;
    private Player winner;

    Game() {
        this.players = new ArrayList<>();
        this.lastPlayerIndex = -1;
        this.gameStatus = GameStatus.IN_PROGRESS;
        this.moves = new ArrayList<>();
        this.winner = null;
    }

    public void makeMove() {

        while(gameStatus != GameStatus.COMPLETED) {
            lastPlayerIndex += 1;
            lastPlayerIndex = lastPlayerIndex%2;

            System.out.println("Hi " + players.get(lastPlayerIndex).getName() + "!! It's your turn now.");

            getPlayerMove();
        }

    }

    public void getPlayerMove() {
        Move move = this.players.get(lastPlayerIndex).makeMove();

        Cell destCell = move.getTo();
        Piece destPiece = destCell.getPiece();

        Boolean flag = false;
        if(destPiece.getType() == KING) {
            flag = true;
        }

        if(board.makeMoveIfPossible(move)) {
            //Check For Checkmate
        }
    }

//    public Boolean checkIfWon() {
//
//    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getLastPlayerIndex() {
        return lastPlayerIndex;
    }

    public void setLastPlayerIndex(int lastPlayerIndex) {
        this.lastPlayerIndex = lastPlayerIndex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public static Builder build() {
        return new Builder();
    }

    public static class Builder {
        private List<Player> players;

        public List<Player> getPlayers() {
            return players;
        }

        public void setPlayers(List<Player> players) {
            this.players = players;
        }

        public Game game() throws InvalidGameException {
            if(players.size() == 0){
                throw new InvalidGameException();
            }

            Game game = new Game();
            game.players = this.players;

            return game;
        }
    }

}
