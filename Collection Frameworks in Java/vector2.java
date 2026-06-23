import java.util.*;

public class vector2 {
    public static void main(String[] args) {
        Vector <String> v = new Vector<>();

        v.add("Java");
        v.add("Sql");
        v.add("Python");


        // for(int i = 0;i<v.size();i++){
        //     System.out.println(v.get(i));
        // }

        for (String s : v) {
            System.out.println(s);
        }
    }
    
}
