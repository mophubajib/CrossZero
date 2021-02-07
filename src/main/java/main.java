import java.util.Scanner;

public class main {
    public static void main (String []args){


        GUIMainWindow guIcross = new GUIMainWindow();
        guIcross.createFrame();


        Logic logic = new Logic();
        logic.start();

        //BotPlayer botPlayer = new BotPlayer();
        //System.out.println(botPlayer.getMoveBot());
    }
}
