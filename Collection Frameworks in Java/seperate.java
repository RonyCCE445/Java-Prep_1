import java.util.ArrayList;

public class seperate {
    public static void main(String[] args) {
        ArrayList <Integer> org = new ArrayList<>();
        ArrayList <Integer> even = new ArrayList<>();
        ArrayList <Integer> odd = new ArrayList<>();


        org.add(1);
        org.add(2);
        org.add(3);
        org.add(4);
        org.add(5);
        org.add(6);
        org.add(7);


        for(int i = 0 ;i<org.size();i++){
            if(org.get(i)%2 == 0){
                even.add(org.get(i));
            }

            else if(org.get(i)%2!=0){
                odd.add(org.get(i));

            }

        }

        System.out.println("Original List is: "+org);
        System.out.println("Even List is: "+even);
        System.out.println("Odd List is: "+odd);
    }
}
