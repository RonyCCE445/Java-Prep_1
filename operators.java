public class operators {
    public static void main(String[] args) {
        int num1= 4;
        int num2=5;
        int result = num1+num2;
        double div= num1/num2;
        double rem= num1%num2;
        boolean result1= num1>=num2;
        boolean comp= num1==num2 && num1>num2;
        System.out.println("The sum is: "+result);
        System.out.println("The division is: "+div);
        System.out.println("The remainder is: "+rem);
        System.out.println("The result is: "+result1);
        System.out.println("The comparison is: "+comp);
        int comp2=0;

        comp2 = num1>num2 ? 5:10;
        System.out.println("The comparison is: "+comp2+" hence ternary operator is working");

    }
}
