class Student{
    String name;
    int rollNo;
    int marks;

    public Student (String name, int rollNo, int marks)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;


    }

    public void displayDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}



public class q1 {
    public static void main(String[] args) {
        Student S1= new Student( "Koustav", 1 ,92);
        Student S2 = new Student ("Rony", 2, 77);
        Student S3 = new Student ("Rima", 3 , 100);

        S1.displayDetails();
        S2.displayDetails();
        S3.displayDetails();


    }
}
