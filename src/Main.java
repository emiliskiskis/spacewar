
public class Main {

    public interface MassObjectInterface {
        void setMass(double mass);
        double getMass();
        double getAcc();
        void calculateGravity();
    }

    private static double randomWithRange(double min, double max){
        double range = (max - min) + 1;
        return Math.random() * range + min;
    }

    public static void main(String[] args){
        //System.out.println("Hello world!");
        //Spaceship x = new Spaceship(100);
        //.out.println("Mass of spaceship x is " + x.getMass());

        MassObject[] planets = {
            new MassObject(6e24, 0, 0),
            new Spaceship(10, 0, 6378000)
        };
        /*
        MassObject[] planets = new MassObject[10];
        for(int i = 0; i < planets.length; i++){
            planets[i] = new MassObject(randomWithRange(1e9d, 9e10d), randomWithRange(-9e8d, 9e8d), randomWithRange(-9e8d, 9e10d));
        }
        */
        for(int i = 0; i < planets.length; i++){
            planets[i].calculateGravity();
        }
        for(MassObject i : planets){
            System.out.println("Acceleration of object with mass " + i.getMass() + " and position (" + i.coord_x + "; " + i.coord_y + ") is " + i.getAcc());
        }
        Window window = new Window();
    }
}