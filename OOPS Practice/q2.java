class Mobile {
    String Brand;
    String Model;
    int Price;

    public Mobile (String Brand, String Model, int Price)
    {
        this.Brand = Brand;
        this.Model = Model;
        this.Price = Price;


    }

    public void showdetails ()
    {
        System.out.println("Brand: " +Brand);
        System.out.println("Model: " +Model);
        System.out.println("Price: "+Price);
    }

    public void makeCall()
        {
            System.out.println("Calling....");

        }
    

}

public class q2 {
    public static void main(String[] args) {
        Mobile M1 = new Mobile( "Apple", "iphone 14 Pro Max", 150000);
        Mobile M2 = new Mobile ("Vivo", "Vivo V70 Elite", 50000);
        Mobile M3 = new Mobile ("Samsung" , "Samsung Galaxy S26 Ultra", 120000);


        M1.showdetails();
        M1.makeCall();
        M2.showdetails();
        M2.makeCall();
        M3.showdetails();
        M3.makeCall();
    }
}
