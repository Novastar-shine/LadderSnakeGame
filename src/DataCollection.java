import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class DataCollection {
    public static ArrayList<Player> playerArrayList = new ArrayList();
    static int numPlayers;
    public static int numPlayers() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Please enter the number of players with a minimum of 2 and max of 4: ");
            numPlayers = input.nextInt() + 1;
            if (numPlayers < 3 || numPlayers > 5) {
                System.out.println("Invalid number of players");
            }
        } while (numPlayers > 5 || numPlayers < 3);
        return numPlayers;
    }
    public static void addPlayerInfo() {
        System.out.println("\nLet's roll the dice to decide, who will play first. \n");
        for (int i = 1; i < numPlayers; ++i) {
            int diceRoll = LadderAndSnake.flipDice();
            String name = "Player " + i;
            Player player;
            switch (i) {
                case 0:
                    break;
                case 1:
                    player = new Player(i, 0, diceRoll);
                    System.out.println(name + " got dice value of " + diceRoll);
                    playerArrayList.add(player);
                    break;
                case 2:
                    player = new Player(i, 0, diceRoll);
                    System.out.println(name + " got dice value of " + diceRoll);
                    playerArrayList.add(player);
                    break;
                case 3:
                    player = new Player(i, 0, diceRoll);
                    System.out.println(name + " got dice value of " + diceRoll);
                    playerArrayList.add(player);
                    break;
                case 4:
                    player = new Player(i, 0, diceRoll);
                    System.out.println(name + " got dice value of " + diceRoll);
                    playerArrayList.add(player);
                    break;
            }
        }
    }
    public static ArrayList<Player> duplicateDiceCheck() {
        for (int i = 0; i < playerArrayList.size(); i++) {
            for (int j = 0; j < playerArrayList.size(); j++) {
                while (playerArrayList.get(i).diceRoll == playerArrayList.get(j).diceRoll && playerArrayList.get(i) != playerArrayList.get(j)) {
                    System.out.println("Player " + playerArrayList.get(i).numPlayer + " dice value is " + playerArrayList.get(i).diceRoll + " and has the same dice value as Player " + playerArrayList.get(j).numPlayer);
                    playerArrayList.get(i).diceRoll = LadderAndSnake.flipDice();
                    playerArrayList.get(j).diceRoll = LadderAndSnake.flipDice();
                    System.out.println("Player " + playerArrayList.get(i).numPlayer + " new dice value is " + playerArrayList.get(i).diceRoll);
                    System.out.println("Player " + playerArrayList.get(j).numPlayer + " new dice value is " + playerArrayList.get(j).diceRoll);
                };
            }
        }
        return playerArrayList;
    }
    public static void orderPlayer(){
        Collections.sort(playerArrayList);
        System.out.println("\nThe order of the players will go as follow: ");
        for(int i=0;i<playerArrayList.size();i++){
            System.out.println("Player "+playerArrayList.get(i).numPlayer);
        }
        }
    public static void play(ArrayList<Player> players) {
        System.out.println("\nEnter 0 to start the game. ");
        Scanner input = new Scanner(System.in);
        int command = input.nextInt();
        if (command == 0) {
            while(true) {
                for(int i = 0; i < playerArrayList.size(); ++i) {
                    int diceRoll = LadderAndSnake.flipDice();
                    int positionBeforeSnakeAndLadder = ((Player)playerArrayList.get(i)).getPosition() + diceRoll;
                    int nextPosition = LadderAndSnake.findNextPosition(((Player)playerArrayList.get(i)).getPosition() + diceRoll);
                    ((Player)playerArrayList.get(i)).setPosition(nextPosition);
                    boolean win = true;
                    PrintStream var10000 = System.out;
                    String var10001 = "Player "+((Player)playerArrayList.get(i)).getNumPlayer();
                    var10000.println(var10001 + ", you got dice of " + diceRoll);
                    if (positionBeforeSnakeAndLadder == 16 || positionBeforeSnakeAndLadder == 48 || positionBeforeSnakeAndLadder == 62 || positionBeforeSnakeAndLadder == 64 || positionBeforeSnakeAndLadder == 93 || positionBeforeSnakeAndLadder == 95 || positionBeforeSnakeAndLadder == 97 || positionBeforeSnakeAndLadder == 98) {
                        System.out.print("You slid down a snake!");
                    }

                    if (positionBeforeSnakeAndLadder == 1 || positionBeforeSnakeAndLadder == 4 || positionBeforeSnakeAndLadder == 9 || positionBeforeSnakeAndLadder == 21 || positionBeforeSnakeAndLadder == 28 || positionBeforeSnakeAndLadder == 36 || positionBeforeSnakeAndLadder == 51 || positionBeforeSnakeAndLadder == 71 || positionBeforeSnakeAndLadder == 80) {
                        System.out.print("You climbed up a ladder!");
                    }

                    System.out.println(" Your new position is " + nextPosition);
                    if (nextPosition == 100) {
                        System.out.println("You win ");
                        System.exit(0);
                    } else {
                        System.out.println("Keep going \n");
                    }
                }
            }
        }
    }
}