import java.util.Vector;
import java.lang.Math;

public class MassObject {
    int mass;
    float speed_x, speed_y, coord_x, coord_y;
    private static final double NEWTON_G = Math.pow(6.674, -11);
    private static Vector<MassObject> MassObjectList;

    MassObject(int mass) {
        this.mass = mass;
        MassObjectList.add(this);
    }
    void calculateGravity () {
        for (MassObject x : MassObjectList) {
            if(this != x){

            }
        }
    }
}

