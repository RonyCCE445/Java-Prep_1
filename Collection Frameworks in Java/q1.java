import java.util.ArrayList;

public class q1 {
    public static void main(String[] args) {
        ArrayList<String> Student =  new ArrayList<>();

        Student.add("Koustav");
        Student.add("Rima");
        Student.add("Rony");
        Student.add("JalebiBai");
        

        for (int i =0; i<Student.size();i++){

            System.out.println(Student.get(i));
        }
        System.out.println();

        Student.remove("Rony");

        for (int i =0; i<Student.size();i++){

            System.out.println(Student.get(i));
        }
        System.out.println();

        Student.set(2,"Rahul");
        
        for (int i =0; i<Student.size();i++){

            System.out.println(Student.get(i));
        }

        
    }
}
