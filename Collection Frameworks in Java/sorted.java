import java.util.ArrayList;
public class sorted {
    public static void main(String[] args) {
        ArrayList <Integer> a1 = new ArrayList<>();

        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);

        boolean isSorted = true;

    for(int i = 0; i<a1.size()-1;i++){
        if(a1.get(i)>a1.get(i+1)){
            isSorted = false;
            
        }
    }    
    
    if(isSorted==true){
        System.out.println("Sorted");
    }
    else{
        System.out.println("Not Sorted");
    }


    }    
}
