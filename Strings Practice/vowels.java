class CalculateVowel{
    String s1;
    

    CalculateVowel(String s1){
        this.s1 =s1;
    }

    void countVowel(){
        int count =0;
        for(int i =0; i<s1.length();i++){
            char ch = s1.charAt(i);
            if( (ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'E' || ch ==  'I'|| ch == 'O' || ch == 'U')){

                count++;
            }
        }

        System.out.println("Number of Vowels in "+s1+" is : "+count);

    }

    void countConsonents(){
int count =0;
        for(int i =0; i<s1.length();i++){
            char ch = s1.charAt(i);

            if (Character.isLetter(ch)){
                if( !((ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'E' || ch ==  'I'|| ch == 'O' || ch == 'U'))){
           
                        count++;
                }
            }
        }
        System.out.println("Number of Consonents in "+s1+" is : "+count);
            
    }

    
}
public class vowels {
    public static void main(String[] args) {
        CalculateVowel s1 = new CalculateVowel("Argentina");
        CalculateVowel s2  = new CalculateVowel("BCDHGpiuyt");

        s1.countVowel();
        s2.countVowel();
        s1.countConsonents();
        s2.countConsonents();

        

        
    }
}
