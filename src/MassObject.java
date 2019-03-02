import java.util.ArrayList;
import java.lang.Math;

public class MassObject implements Main.MassObjectInterface {
    private double mass;
    double speed_x, speed_y, acc_x, acc_y, coord_x, coord_y;
    private static final double NEWTON_G = 6.674e-11;
    private static ArrayList<MassObject> MassObjectList = new ArrayList<>();

    MassObject(){
        MassObjectList.add(this);
        speed_x = speed_y = acc_x = acc_y = 0;
    }

    MassObject(double mass, double coord_x, double coord_y) {
        this();
        this.mass = mass;
        this.coord_x = coord_x;
        this.coord_y = coord_y;
    }

    public double getMass(){
        return this.mass;
    }

    public void setMass(double mass){
        this.mass = mass;
    }

    public void setCoords(double coord_x, double coord_y){
        this.coord_x = coord_x; this.coord_y = coord_y;
    };

    public double getAcc(){
        return Math.sqrt(this.acc_x * this.acc_x + this.acc_y * this.acc_y);
    }

    private double getDistance(MassObject a) {
        return Math.sqrt(Math.pow(this.coord_x - a.coord_x, 2) + Math.pow(this.coord_y - a.coord_y, 2));
    }

    private double getDistanceX(MassObject a){
        return a.coord_x - coord_x;
    }

    private double getDistanceY(MassObject a){
        return a.coord_y - coord_y;
    }

    private double getAcceleration(MassObject a){
        return NEWTON_G * a.mass / Math.pow(getDistance(a), 2);
    }

    private void setAcceleration(MassObject a){
        double acc = getAcceleration(a);
        acc_x += getDistanceX(a) / getDistance(a) * acc; acc_y += getDistanceY(a) / getDistance(a) * acc;
    }

    public void calculateGravity () {
        System.out.println("Calculating gravity of planet " + MassObjectList.indexOf(this));
        for (int i = 0; i < MassObjectList.size(); i++)
            if(this != MassObjectList.get(i)){
                System.out.println("Distance to planet " + i + " is " + getDistance(MassObjectList.get(i)) + ", acceleration to it is " + getAcceleration(MassObjectList.get(i)));
                setAcceleration(MassObjectList.get(i));
            }
        System.out.println("Final acceleration is " + getAcc());
    }
}