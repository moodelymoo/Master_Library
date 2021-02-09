package Scrabble.Logic.GameObjects;

public class Player {
    private final String name;
    private Hand hand;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void addToScore(int score){
        this.score = this.score + score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }
}
