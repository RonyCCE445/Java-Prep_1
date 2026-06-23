class CheckPalindrome{
    String s;

    CheckPalindrome(String s){
        this.s=s;

    }

    void checkPalindrome(){
        s = s.toLowerCase();
        int i=0;
        int j= s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("Not Palindrome");
                return;
            }

            i++;
            j--;
        }
        
        System.out.println("Palindrome");
    }
}

public class palindrome2 {
    public static void main(String[] args) {
        CheckPalindrome cp = new CheckPalindrome("Racecar");
        CheckPalindrome cp1 = new CheckPalindrome("BTCDBCB");

        cp.checkPalindrome();
        cp1.checkPalindrome();
    }    
}
