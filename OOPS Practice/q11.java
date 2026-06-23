class Employee{

    public void name (String name){
        
        System.out.println("Name: "+name);
    }

    public void salary(double salary){
        System.out.println("Salary: "+salary);
    }

}

class Manager extends Employee{

    public void department(String dept){
        System.out.println("Department is: "+dept);
    }
}



public class q11 {
    public static void main(String[] args) {
        Manager m1 = new Manager();

        m1.name("Koustav");
        m1.salary(2545556.369);
        m1.department("Development");
    }
    
}
