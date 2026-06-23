class Calculator{

    public void add(int a, int b){
        System.out.println(a +" + "+b +" = "+ (a+b) );
    }

    public void add(int a, int b, int c){
        System.out.println(a +" + "+b +" + "+c+" = "+ (a+b+c) );
    }

    public void add (double a, double b){
        System.out.println(a +" + "+b +" = "+ (a+b) );
    }
}



public class q12 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        c1.add(56,78);
        c1.add(256,569,996);
        c1.add(2569.36,5696.69);
    }
    
}
