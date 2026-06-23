class laptop{
    String Brand;
    int Price;

    laptop()
    {
        System.out.println("Laptop is created, using default constructor");

    }

    laptop(String Brand)
    {
        this.Brand = Brand;
        System.out.println("Brand: "+ Brand);

    }

    laptop(String Brand, int Price)
    {
        this.Brand=Brand;
        this.Price = Price;

        System.out.println("Brand: "+Brand);
        System.out.println("Price: "+Price);

    }
}

public class constructor_overloading {
    public static void main(String[] args) {
        // laptop l1= new laptop ();
        // System.out.println();
        // laptop l2 = new laptop("Asus");
        // System.out.println();
        // laptop l3 = new laptop ("Lenovo", 60000);
        // System.out.println();



    }
}
