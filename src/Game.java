import java.awt.*;

public class Game extends Canvas {
    //FIELDS
    final int WIDTH = 640, HEIGHT = 480;

    //METHODS
    public void start(){
        Dimension size = new Dimension (WIDTH, HEIGHT);
        setPreferredSize(size);
        paint(null);
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
    }
}