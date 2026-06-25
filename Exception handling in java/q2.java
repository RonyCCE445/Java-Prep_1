import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        
       try{
      int num = sc.nextInt();
      System.out.println("The number entered is: "+num);
       }catch(InputMismatchException e){
        System.out.println(e);
        System.out.println("Invalid input");
       }
           sc.close();
    }

}
