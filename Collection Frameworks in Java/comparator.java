import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    String name;
    int rollno;

    Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString(){
        return name+ " "+rollno;
    }
}
public class comparator {
    public static void main(String[] args) {
        ArrayList <Student> students = new ArrayList<>();

        students.add(new Student( "Ram",21));
        students.add(new Student("Amit", 56));
        students.add(new Student("Rohan", 25));
        students.add(new Student("Anurag", 25));

        System.out.println("Original List: "+students.toString());

        Collections.sort(students, new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2){
                if(s1.rollno != s2.rollno){
                    return s1.rollno-s2.rollno;


                }

                else{
                    return s1.name.compareTo(s2.name);
                }
            }
            
        });

        System.out.println(" Sorted List  : "+students.toString());
        

    }
}
