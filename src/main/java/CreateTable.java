import java.util.ArrayList;
import java.util.Arrays;

public class CreateTable {

    private int[] gameArray = new int[9];

    CreateTable(){
        for (int i = 0; i < gameArray.length; i++) {
            this.gameArray[i] = 0;
        }
    }

    public void setGameArray(int x, int y) {
        this.gameArray[x] = y;
    }

    public int[] getGameArray() {
        return gameArray;
    }
    public int getGameCell(int x){
        return gameArray[x];
    }

    @Override
    public String toString() {
        String[] test = {"_", "_", "_", "_", "_", "_", " ", " ", " "};
        for (int i = 0; i < 9; i++) {
            if (gameArray[i] == 1) {
                test[i] = "X";
            } else if (gameArray[i] == 10) {
                test[i] = "O";
            }
        }

        return test[0] + "|" + test[1] + "|" + test[2] + "\n" +
                test[3] + "|" + test[4] + "|" + test[5] + "\n" +
                test[6] + "|" + test[7] + "|" + test[8] + "\n";
    }
}
