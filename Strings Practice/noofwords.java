class Countwords{
    String s;
    Countwords(String s){
        this. s = s;
    }

void words(){

    int count = 0;

    for(int i = 0; i<s.length(); i++){
        if((s.charAt(i)!= ' ') && (i == 0 || s.charAt(i-1)==' ')){

            count++;
        }

    }

    System.out.println("The number of words in the string '"+s+"' is: "+count);
}
}




public class noofwords {
    public static void main(String[] args) {
        Countwords s = new Countwords("This is a String");

        s.words();
    }
}
