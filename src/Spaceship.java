
public class Spaceship extends MassObject {
    Spaceship(int mass){
        super(mass, 0, 0);
    }
    Spaceship(int mass, double coord_x, double coord_y){
        super(mass, coord_x, coord_y);
    }
}