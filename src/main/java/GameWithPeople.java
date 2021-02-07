public class GameWithPeople {

    Move move = new Move();

    void startGameWithPeople() {

        int count = 0;
        do {
            System.out.println("Крестики делают ход. Выберете клетку от 0 до 8");
            move.moveCross();
            count = count + 1;
            if (move.getCheck() > 0) {
                break;
            }
            if (count == 9) {
                System.out.println("Ничья");
                break;
            }
            System.out.println("Нолики делают ход. Выберете клетку от 0 до 8");
            move.moveZero();
            if (move.getCheck() >= 0) {
                break;
            }
            count = count + 1;
        } while (count < 9);
    }
}
