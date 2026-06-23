class CheckPrefix{
    String s;

    CheckPrefix(String s){
        this.s = s;
    }
    
    void checkPrefix(){
        boolean result =s.startsWith("Java");

        System.out.println(result);
    }
}

class CheckSuffix{
    String s; 

    CheckSuffix(String s){
        this.s =s;

    }

    void checkSuffix(){

        boolean result = s.endsWith(".com");
        System.out.println(result);
    }
}


public class prefixsuffix {
    public static void main(String[] args) {
        CheckPrefix cp = new CheckPrefix("Java Programming");
        CheckSuffix cs = new CheckSuffix("Google.com");
        CheckPrefix cp1 = new CheckPrefix("Python Programing");
        CheckSuffix cs1 = new CheckSuffix("Something.in");
        System.out.println("Checking prefix: ");
        System.out.println();
        cp.checkPrefix();
        cp1.checkPrefix();
        System.out.println("Checking Suffix: ");
        System.out.println();
        cs.checkSuffix();
        cs1.checkSuffix();
    }
}
