import java.util.*;
public class q3 {

    private static int withdraw(int balance,int amount)throws IllegalArgumentException{
        
        if( amount> balance){
        throw new IllegalArgumentException();
        }
        else{
           return balance-amount;}
        }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the balance: ");
        int balance = sc.nextInt();
        System.out.println("Enter the Amount to withdraw: ");
        int amount = sc.nextInt();
        try{
            System.out.println(withdraw(balance, amount));
        }catch(IllegalArgumentException e){
            System.out.println("Amount cannot be more than the balance");
        }
        finally{
            sc.close();
        }
        
        
  
    }
}
