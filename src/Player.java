public class Player implements Comparable<Player>{
    int numPlayer;
    int position;
    int diceRoll;
    public Player(int numPlayer, int position, int diceRoll) {
        this.numPlayer = numPlayer;
        this.position = position;
        this.diceRoll = diceRoll;
    }
    public int getNumPlayer() {
        return this.numPlayer;
    }
    public void setNumPlayer(int numPlayer) {
        this.numPlayer = numPlayer;
    }
    public int getDiceRoll() {
        return diceRoll;
    }
    public void setDiceRoll(int diceRoll) {
        this.diceRoll = diceRoll;
    }
    public int getPosition() {
        return this.position;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public int compareTo(Player player2) {
        if (this.diceRoll > player2.diceRoll) {
            return -1;
        } else return 1;
    }
}
