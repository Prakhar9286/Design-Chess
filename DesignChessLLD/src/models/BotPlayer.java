package models;

public class BotPlayer extends Player {

    public BotPlayer(PlayerType playerType, String color, String name) {
        super(PlayerType.BOT, "BLACK", name);
    }

    @Override
    public Move makeMove() {
        //Bot Playing can be implemented as an AI Player or random playing Strategy.
        return null;
    }
}
