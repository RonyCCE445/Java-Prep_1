class ReplaceSpaces{
    String s;

    ReplaceSpaces(String s){
        this.s =s;
    }


    void replaceSpace(){

        String new_S = "";
        

        for (int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                new_S = new_S + '_';
            }
            else{
                new_S = new_S+ ch;
            }
        }

        System.out.println(new_S);
    }
}

class RemoveSpaces{

    String s;

    RemoveSpaces(String s){
        this.s=s;
    }

    void removeSpaces(){
        String new_s = "";
        
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                continue;

            }

            else{
                new_s = new_s+ch;
            }
        }
        System.out.println(new_s);
    }
}




public class replacespace {
    public static void main(String[] args) {
        ReplaceSpaces sp = new ReplaceSpaces("This is a String");
        RemoveSpaces sp1 = new RemoveSpaces("This is a String");

        sp.replaceSpace();
        sp1.removeSpaces();
    }
}
