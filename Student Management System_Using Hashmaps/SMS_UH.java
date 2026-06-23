import java.util.*;

class Student{
   final private int studentId;
   private static int nextId=1;
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course){
        this.name = name;
        this.age = age;
        this. course = course;

        studentId = nextId;
        nextId++;
    }

    public int getStudentId(){
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    @Override

    public String toString(){
        return "StudentId: SU_"+ studentId+" | "+ 
        " Student Name: "+name+" | "+
        "Age: "+age+" | "+ 
        " Course: "+course+" | ";
    }


}

class StudentManager{
    private HashMap<Integer, Student> students;

    public StudentManager(){
        students = new HashMap<>();
    }

    public void addStudent(Student student){
       if(student == null){
        System.out.println("Student Cannot be Null");
        return;
       }
       else{
        int id = student.getStudentId();

        students.putIfAbsent(id, student);
        System.out.println("Student Added Successfully!");

       } 
        


    }

    public void searchStudentById(int id){
        Student student = students.get(id);
        if(student != null){
             System.out.println(student);
        }
        else{
            System.out.println("Student Not Found!");
        }
    }

    public void updateStudentName(int id, String newName){
        if(students.containsKey(id)){
            Student student = students.get(id);
            System.out.println("Name of student is: "+student.getName());
            student.setName(newName);

            System.out.println("New Name Successfully Updated to: "+student.getName());


        }

        else{
            System.out.println("No Student found!");
        }
    }

    public void updateStudentAge(int id, int newAge){
                if(students.containsKey(id)){
            Student student = students.get(id);
            System.out.println("Age of student is: "+student.getAge());
            student.setAge(newAge);

            System.out.println("New Age Successfully Updated to: "+student.getAge());


        }

        else{
            System.out.println("No Student found!");
        }
    }

    public void updateStudentCourse(int id, String newCourse){
                if(students.containsKey(id)){
            Student student = students.get(id);
            System.out.println("Course of student is: "+student.getCourse());
            student.setCourse(newCourse);

            System.out.println("New Course Successfully Updated to: "+student.getCourse());


        }

        else{
            System.out.println("No Student found!");
        }
    }
public void removeStudent(int id){
    Student removedstudent = students.remove(id);

    if(removedstudent !=null){
        System.out.println("Student with ID: "+removedstudent.getStudentId()+" | Name : "+removedstudent.getName()+" is removed successfully");
    }

    else{
        System.out.println("No Student found with ID: "+id);
    }
}

public void displayStudents(){
    if(students.isEmpty()){
        System.out.println("No Students found");
    }
    else{
        for(Map.Entry<Integer, Student> entry:students.entrySet()){
            Student student = entry.getValue();
            System.out.println(student);
        }
    }
}

}
 public class SMS_UH {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Student Name");
            System.out.println("4. Update Student Age");
            System.out.println("5. Update Student Course");
            System.out.println("6. Remove Student");
            System.out.println("7. Display All Students");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    Student student = new Student(name, age, course);
                    manager.addStudent(student);

                    break;

                case 2:

                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();

                    manager.searchStudentById(searchId);

                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    int updateNameId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    manager.updateStudentName(updateNameId, newName);

                    break;

                case 4:

                    System.out.print("Enter Student ID: ");
                    int updateAgeId = sc.nextInt();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    manager.updateStudentAge(updateAgeId, newAge);

                    break;

                case 5:

                    System.out.print("Enter Student ID: ");
                    int updateCourseId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();

                    manager.updateStudentCourse(updateCourseId, newCourse);

                    break;

                case 6:

                    System.out.print("Enter Student ID: ");
                    int removeId = sc.nextInt();
                    sc.nextLine();

                    manager.removeStudent(removeId);

                    break;

                case 7:

                    manager.displayStudents();

                    break;

                case 8:

                    System.out.println("Thank you for using Student Management System!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}