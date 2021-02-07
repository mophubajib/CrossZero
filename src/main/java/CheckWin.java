public class CheckWin {

    int checkWin(int[] arrayGame) {
        if (checkHorizontalString(arrayGame) == 1 || checkVerticalString(arrayGame) == 1 || checkDiagonalString(arrayGame) == 1) {
            System.out.println("Победили крестики");
            return 1;
        } else if (checkHorizontalString(arrayGame) == 0 || checkVerticalString(arrayGame) == 0 || checkDiagonalString(arrayGame) == 0) {
            System.out.println("Победили нолики");
            return 0;
        } else {
            return -1;
        }
    }

    int checkHorizontalString(int[] arrayGame) {
        int count = 0;
        int sum = 0;
        do {
            for (int i = 0; i < 3; i++) {
                sum = sum + arrayGame[count + i];
            }
            if (sum == 3) {
                return 1;
            } else if (sum == 30) {
                return 0;
            }
            count = count + 3;
            sum = 0;

        } while (count < 7);
        return -1;
    }

    public int checkVerticalString(int[] arrayGame) {
        int count = 0;
        int sum = 0;
        do {
            for (int i = 0; i < 7; i = i + 3) {
                sum = sum + arrayGame[count + i];
            }
            if (sum == 3) {
                return 1;
            } else if (sum == 30) {
                return 0;
            }
            count = count + 1;
            sum = 0;

        } while (count < 3);
        return -1;
    }

    public int checkDiagonalString(int[] arrayGame) {
        if ((arrayGame[0] + arrayGame[4] + arrayGame[8]) == 3 || (arrayGame[2] + arrayGame[4] + arrayGame[6]) == 3) {
            return 1;
        } else if ((arrayGame[0] + arrayGame[4] + arrayGame[8]) == 30 || (arrayGame[2] + arrayGame[4] + arrayGame[6]) == 30) {
            return 0;
        }
        return -1;
    }

}
