class CountCharacter{
    String s;
    char c;

    CountCharacter(String s,char c){
        this.s = s;
        this.c = c;
    }

    void countCharacter(){
        int count = 0;
        String sl= s.toLowerCase();
        char ch= Character.toLowerCase(c);
      
        for(int i=0;i<s.length();i++){
            if(sl.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("Number of time '"+c+"' has appeared in the String '"+s+"' is: "+count);
    }
}


public class countcharacters {
    public static void main(String[] args) {
        CountCharacter c = new CountCharacter("OOPS", 'o');

        c.countCharacter();
    }
}
