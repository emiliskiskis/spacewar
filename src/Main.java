
public class Main {

    public interface MassObjectInterface {
        void setMass(double mass);
        double getMass();
        double getAcc();
        void calculateGravity();
    }

    public interface SpaceshipInterface extends MassObjectInterface {

    }

    private static double randomWithRange(double min, double max){
        double range = (max - min) + 1;
        return Math.random() * range + min;
    }

    public static void main(String[] args){
        System.out.println("Hello world!");
        Spaceship x = new Spaceship(100);
        System.out.println("Mass of spaceship x is " + x.getMass());

        MassObject[] planets = new MassObject[10];
        for(int i = 0; i < planets.length; i++){
            planets[i] = new MassObject((int)randomWithRange(1e9d, 9e10d));
        }
        for(int i = 0; i < planets.length; i++){
            planets[i].calculateGravity();
        }
        for(MassObject i : planets){
            System.out.println("Acceleration of object with mass " + i.getMass() + " is " + i.getAcc());
        }
    }
}