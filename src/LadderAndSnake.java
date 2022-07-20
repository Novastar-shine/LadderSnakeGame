public class LadderAndSnake {
    public static int flipDice() {
        int diceRoll = 1 + (int)(Math.random() * 6.0);
        return diceRoll;
    }
    public static int findNextPosition(int newPosition) {
        int[] nextPosition = new int[100];
        int stepToCheck;
        for(stepToCheck = 0; stepToCheck < 100; ++stepToCheck) {
            int nextPositionOnBoard = stepToCheck+1;
            nextPosition[stepToCheck] = nextPositionOnBoard;
        }
        nextPosition[0] = 38;
        nextPosition[3] = 14;
        nextPosition[8] = 31;
        nextPosition[15] = 6;
        nextPosition[20] = 42;
        nextPosition[27] = 84;
        nextPosition[35] = 44;
        nextPosition[47] = 30;
        nextPosition[50] = 67;
        nextPosition[61] = 19;
        nextPosition[63] = 60;
        nextPosition[70] = 91;
        nextPosition[79] = 100;
        nextPosition[92] = 68;
        nextPosition[94] = 24;
        nextPosition[96] = 76;
        nextPosition[97] = 78;
        stepToCheck = newPosition - 1;
        boolean maxStep = true;
        boolean win = true;
        if (stepToCheck > 99) {
            stepToCheck = 100 - (stepToCheck - 99) - 1;
        }
        return nextPosition[stepToCheck];
    }
}
