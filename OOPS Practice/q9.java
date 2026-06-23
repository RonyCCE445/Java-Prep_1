class Vehicle{
    String brand;


    public void start(){
        System.out.println("The Vehicle is started");
    }

    public void displaybrand(String brand){
        System.out.println("Brand: "+brand);
    }
}

class Car extends Vehicle{
    
    public void drive(){
        System.out.println("Driving car");
    }
}




public class q9 {
    public static void main(String[] args) {
        Car c1 = new Car();


        c1.displaybrand("Maruti");
        c1.drive();
        c1.start();
    }
}
