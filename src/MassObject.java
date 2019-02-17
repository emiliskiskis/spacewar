public class MassObject {
    private int mass;
    public int getMass(){
        return this.mass;
    }
    public void setMass(int mass){
        this.mass = mass;
    }

    MassObject(int mass){
        setMass(mass);
    }
}
