package models;

public abstract class Player {
    private PlayerType playerType;
    private Status status;
    private String color;
    private String name;

    public Player(PlayerType playerType, String color, String name) {
        this.color = color;
        this.name = name;
        this.playerType = playerType;
    }

    public abstract Move makeMove();

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
