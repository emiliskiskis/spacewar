import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {

    enum Status {MAIN_MENU, SELECTION, PLAYING, PAUSED};
    Status gameStatus;

    public Game(){
        gameStatus = Status.MAIN_MENU;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        if(gameStatus == Status.MAIN_MENU){

        }
    }
}