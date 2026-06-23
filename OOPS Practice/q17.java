interface connectable{

    void connect();
}

class Mobile implements connectable{

    @Override
    public void connect(){
        System.out.println("Mobile Successfully Connected to the smart device");
    }
}

class Laptop implements connectable {

    @Override
    public void connect(){
        System.out.println("Laptop Successfully connected to the smart device");
    }
}

class SmartTV implements connectable{

    @Override
    public void connect(){

        System.out.println("SmartTv Successfully connected to the smart device");
    }
}




public class q17 {
    public static void main(String[] args) {
        connectable c1 = new Mobile();
        connectable c2 = new Laptop();
        connectable c3 = new SmartTV();

        c1.connect();
        c2.connect();
        c3.connect();
    }    
}
