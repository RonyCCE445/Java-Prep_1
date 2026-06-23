abstract class Employee{
    String name;

    Employee(String name){
        this.name=name;
    }


abstract double calculateSalary();

    void displaydetails(){

        System.out.println("Name of the employee: "+name);
        System.out.println("Salary: "+calculateSalary());
    }



}

class FullTimeEmployee extends Employee{
    double monthlysalary;

    FullTimeEmployee(String name, double monthlysalary){
        super(name);
        this.monthlysalary=monthlysalary;


    }

    @Override
    double calculateSalary(){

        return monthlysalary;
    }
}

class PartTimeEmployee extends Employee{

    double hourlyrate;
    int hoursworked;

    PartTimeEmployee(String name, double hourlyrate, int hoursworked){

        super(name);
        this.hourlyrate = hourlyrate;
        this.hoursworked = hoursworked;
    }


    @Override
    double calculateSalary(){

        return hourlyrate*hoursworked;
    }
}




public class q15 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Rahul" ,25000);
        Employee e2 = new PartTimeEmployee("Rony", 25.99, 256);

        e1.displaydetails();
        System.out.println();
        e2.displaydetails();

    }
    
}
