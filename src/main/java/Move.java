public class Move {

    private int check = -1;
    private int choiseCell;
    BotPlayer botPlayer =new BotPlayer();

    CheckWin checkWin = new CheckWin();
    EnterTXT enterTXT = new EnterTXT();
    CreateTable createTable = new CreateTable();

    public int getChoiseCell() {
        return choiseCell;
    }

    public void setChoiseCell() {
        this.choiseCell = Integer.parseInt(enterTXT.getUserInput().trim());
    }

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    void moveCross() {
        setChoiseCell();
        if (createTable.getGameCell(getChoiseCell()) == 0) {
            createTable.setGameArray(getChoiseCell(), 1);
            System.out.println(createTable.toString());
            setCheck(checkWin.checkWin(createTable.getGameArray()));
        } else {
            System.out.println("Данная клетка уже занята, выберете другую");
            moveCross();
        }
    }

    void moveZero() {
        setChoiseCell();
        if (createTable.getGameCell(getChoiseCell()) == 0) {
            createTable.setGameArray(getChoiseCell(), 10);
            System.out.println(createTable.toString());
            setCheck(checkWin.checkWin(createTable.getGameArray()));
        } else {
            System.out.println("Данная клетка уже занята, выберете другую");
            moveZero();
        }
    }

    void moveCrossBot() {
        botPlayer.setMoveBot();
        if (createTable.getGameCell(botPlayer.getMoveBot()) == 0) {
            createTable.setGameArray(botPlayer.getMoveBot(), 1);
            System.out.println(createTable.toString());
            setCheck(checkWin.checkWin(createTable.getGameArray()));
        } else {
            moveCrossBot();
        }
    }
    void moveZeroBot() {
        botPlayer.setMoveBot();
        if (createTable.getGameCell(botPlayer.getMoveBot()) == 0) {
            createTable.setGameArray(botPlayer.getMoveBot(), 10);
            System.out.println(createTable.toString());
            setCheck(checkWin.checkWin(createTable.getGameArray()));
        } else {
            moveZeroBot();
        }
    }
}
