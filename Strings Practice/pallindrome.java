class CheckPallindrome{
    String s;

    CheckPallindrome(String s){
        this.s = s;
    }

    void checkPallindrome(){
        String reverse ="";

        for( int i = s.length()-1; i >= 0; i--){
            reverse = reverse + s.charAt(i);
        }

        System.out.println("String: "+ s);
        System.out.println("Reverse: "+reverse);

        if(reverse.toLowerCase().equals(s.toLowerCase())){
            System.out.println("Pallindrome");
        }

        else{
            System.out.println("Not Pallindrome");
        }
    }
}

public class pallindrome {
    public static void main(String[] args) {
        CheckPallindrome cp = new CheckPallindrome("Madam");
        CheckPallindrome cp1 = new CheckPallindrome("Java");

        cp.checkPallindrome();
        cp1.checkPallindrome();
    }
}
