public class Logic {


    EnterTXT enterTXT = new EnterTXT();
    GameWithPeople gameWithPeople = new GameWithPeople();
    GameWithBot gameWithBot = new GameWithBot();

    void start() {
        System.out.println("Игрок выбирает кем играть");
        System.out.println("Для игры с человеком - 0, для игры с ботом 1");
        if (choicePlayer() == 0){
            System.out.println("Вы выбрали человека");
            System.out.println("Крестики - ходят первыми, Нолики - ходят вторыми");
            gameWithPeople.startGameWithPeople();
        }
        else {
            System.out.println("Вы выбрали бота");
            System.out.println("0 - ходить первым, 1 - ходить вторым");
            gameWithBot.choiseSideForBot(choiceSide());
        }
    }

    int choiceSide() {
        if (enterTXT.getUserInput().contains("0")) {
            return 0;
        } else {
            return 1;
        }
    }

    int  choicePlayer() {
        if (enterTXT.getUserInput().contains("0")) {
            return 0;
        } else {
            return 1;
        }
    }
}
