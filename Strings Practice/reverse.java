class reverseString{
    String s;


    reverseString(String s){
        this.s =s;
        
    }

    
    void printreverse(){
            String reverse = "";

        for (int i = s.length()-1; i>= 0;i--){
            reverse = reverse + s.charAt(i);
        }

        System.out.println("The reverese of the String '"+s+"' is: "+reverse);
    }
} 





public class reverse {
    public static void main(String[] args) {
        reverseString s = new reverseString("Java");

        s.printreverse();
    }
}