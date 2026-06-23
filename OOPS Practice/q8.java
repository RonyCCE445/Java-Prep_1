class ATM{
    private int pin;
    private double balance;
    


    public int getpin(){
        return pin;
    }

    public void setpin(int pin){
        if(pin>= 1000 && pin <=9999){
            this.pin=pin;
        }
        else{
            System.out.println("Pin must be of 4 digits!");
        }
    }

    public double getbalance(){
        return balance;
    }

    public void setbalance(double balance){
        if(balance>=0){
            this.balance = balance;
        }
        else{
            System.out.println("Balance Cannot be Negative");
        }
    }

    public void deposit(double amount){

        if(amount<=0){
            System.out.println("Invalid Amount");
        }

        else{
            balance = balance + amount;
            System.out.println("Deposit Successful");
        }
    
}

    public void withdraw(double amount){

        if(balance <amount){
            System.out.println("Insufficient balance, Withdrawl unsuccessfull");
        }

        else if(amount<= 0){
            System.out.println("Invalid Amount");
        }

        else{
            balance = balance-amount;
            System.out.println("Withdrawl Successfull");
        }
    }


    public void displaybalance(){

        System.out.println("Remaining Balance: "+balance);
    }
}




public class q8 {
    public static void main(String[] args) {
        ATM ac1 = new ATM();
        ATM ac2 = new ATM();
        
            ac1.setpin(2407);
            ac1.setbalance(2456987.690);
        

        System.out.println("At First the PIN is : "+ac1.getpin());
        System.out.println("And the balance is : "+ ac1.getbalance());

            ac1.setpin(2245);

        System.out.println("New Pin is: "+ ac1.getpin());
        System.out.println("And Balance is still: "+ac1.getbalance());
            ac1.deposit(2456);
            ac1.displaybalance();
            ac1.withdraw(24.690);
            ac1.displaybalance();

            ac2.setpin(356);
            ac2.setbalance(-896);
        System.out.println("At First the PIN is : "+ac2.getpin());
        System.out.println("And the balance is : "+ ac2.getbalance());



    }




}
