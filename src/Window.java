import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    //init
    Window() {
        JFrame window = new JFrame("Spacewar");
        window.setSize(640, 480);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        Game canvas = new Game(); // extends JPanel
        //window.add(canvas);

        // Main menu
        {
            JButton buttonStart = new JButton("Start game");
            JButton buttonQuit = new JButton("Quit");

            window.add(buttonStart);
            window.add(buttonQuit);
        }
    }
}
