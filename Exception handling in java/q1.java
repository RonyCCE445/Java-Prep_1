
public class q1 {


    public static int divide(int a, int b){
        try{
            return a/b;

        }catch(ArithmeticException e){
            System.out.println(e);
            return-1;
        }
}
    public static void main(String[] args) {
        
            int [] numeretor = {10,200,30,40};
            int [] denominator = {1,2,0,4};

            for(int i =0; i<numeretor.length;i++){
                System.out.println(divide(numeretor[i],denominator[i]));
            }

            System.out.println("Good job:)");
        }
}
