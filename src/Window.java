import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    Window(){
        JFrame window = new JFrame("Spacewar");
        window.setSize(640, 480);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        Game canvas = new Game();
        window.add(canvas);
    }
}
