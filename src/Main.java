public class Main {
    private static MassObject createMassObject(int mass){
        return new MassObject(mass);
    }
    public static void main(String[] args){
        System.out.println("Hello world!");
        MassObject x = createMassObject(100);
        System.out.println(x.getMass());
    }
}