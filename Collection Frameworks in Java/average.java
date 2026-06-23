import java.util.ArrayList;

public class average {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        double sum = 0;


        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);


        for(int i =0;i<list.size();i++){
            sum+= list.get(i);
        }

        double average = sum/list.size();

        System.out.println("The List is: "+list);

        System.out.println("Number of elements are: "+list.size());

        System.out.println("Sum of the element is: "+sum);

        System.out.println("So, the Average = sum / number of elements ,that is : "+ sum+ "/"+list.size()+" = "+average);

    }    
}
