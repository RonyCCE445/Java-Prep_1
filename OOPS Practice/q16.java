abstract class Payment{

    abstract void pay(double amount);
}


class UPI extends Payment{

    @Override
    
    void pay(double amount){
        System.out.println("Payed Rupees "+amount+ " Using UPI ");
    }

}

class CreditCard extends Payment{

    @Override
    void pay(double amount){
        System.out.println("Payed Rupees "+ amount + " Using CreditCard");
    }

}

class NetBanking extends Payment{

    @Override
    void pay(double amount){
        System.out.println("Payed Rupees "+amount+ " Using NetBanking");
    }

}
public class q16 {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new NetBanking();


        p1.pay(22569.69);
        p2.pay(250000.63);
        p3.pay(26.03);

    }

}