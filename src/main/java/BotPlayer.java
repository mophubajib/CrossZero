public class BotPlayer {

    private int moveBot;
    public int getMoveBot() {
        return moveBot;
    }
    public void setMoveBot() {
        this.moveBot = (int) (Math.random()*8);
    }
}
