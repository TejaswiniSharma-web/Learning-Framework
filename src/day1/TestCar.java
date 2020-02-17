package day1;

public class TestCar {
    public static void main(String[] args) {
        Car c =new Car() ;
        c.Start();
        c.stop();
        AudiCar C1=new AudiCar();
        C1.Start();
        C1.stop();
        C1.openGps();
        C1.e.eName="Engine X";

    }
}
