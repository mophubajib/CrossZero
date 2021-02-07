import javax.swing.*;

public class GUIMainWindow {

    JButton newGameButton = new JButton("Играть");
    JButton statisticsButton = new JButton("Статистика");
    JButton topTenButton = new JButton("Топ 10");
    JButton lookGameButton = new JButton("Просмотр предыдущих игр");

    void createFrame() {

        JFrame frame = new JFrame();
        JPanel panelMain = new JPanel();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //panelMain.setLayout(new BoxLayout(panelMain,BoxLayout.Y_AXIS));
        panelMain.add(newGameButton);
        panelMain.add(statisticsButton);
        panelMain.add(topTenButton);
        panelMain.add(lookGameButton);
        frame.getContentPane().add(panelMain);

        frame.setBounds(800,300,500,500);
        frame.setVisible(true);
        frame.pack();
    }
}
