package day1;

public class Car {
    Engine e;

    public void  Start(){
        String name;
        e=new Engine();
        e.startup();
        System.out.println("Car Starting");
    }
    public  void stop(){
        System.out.println("car stoping");

    }
}

