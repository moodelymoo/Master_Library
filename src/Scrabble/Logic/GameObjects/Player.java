package Scrabble.Logic.GameObjects;

public class Player {
    private int PLAYER_NUMBER;
    private Hand hand;

    public Player(int pNum) {
        this.PLAYER_NUMBER = pNum;
    }

    public int getPLAYER_NUMBER() {
        return PLAYER_NUMBER;
    }

    public void setPLAYER_NUMBER(int PLAYER_NUMBER) {
        this.PLAYER_NUMBER = PLAYER_NUMBER;
    }
}
