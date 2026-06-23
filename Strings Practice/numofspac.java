class NumberofSpace{
    String s;

    NumberofSpace(String S){
        this.s = S;
    }

    public void countspace(){
        int count = 0;
        
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }

        System.out.println("Total number of spaces in the string '"+ s + "' is: "+count);
    } 

}



public class numofspac {
    public static void main(String[] args) {
        NumberofSpace s = new NumberofSpace("This is a string");

        s.countspace();
    }
}
