class Employee{

    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployee(){

        System.out.println("Name: "+name);
        System.out.println("Salary: $"+salary);
    }




}

class Manager extends Employee{
    String dept;

    Manager(String name,double salary, String dept){
        super( name,salary);
        this.dept = dept;
    }
    
    public void displayManager(){

        displayEmployee();
        System.out.println("Department: "+dept);
    }
}



public class q11_oopsver {
public static void main(String[] args) {
    Manager m1 = new Manager("Koutav",256978.36,"HR");
    
    m1.displayManager();
    
}
    

    
    
    
}
