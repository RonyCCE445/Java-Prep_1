class Employee{
int Id;
String Name;
double Salary;

public Employee (int Id, String Name, Double Salary)
{

    this.Id= Id;
    this.Name = Name;
    this.Salary = Salary;

}

public void annualSalary()
{
    double annual = Salary * 12;
    System.out.println("Annual Salary: " + annual);


}
public void displayDetails()
{
    System.out.println("Id: " + Id);
    System.out.println("Name: " + Name);
    System.out.println("Salary: " + Salary);
}

}



public class q3 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Koustav" , 50000.00);
        Employee e2 = new Employee ( 2, "Rony", 60000.00);
        Employee e3 = new Employee ( 3, "Rima", 70000.00);
        e1.displayDetails();
        e1.annualSalary();
        e2.displayDetails();
        e2.annualSalary();
        e3.displayDetails();
        e3.annualSalary();

    }
}
