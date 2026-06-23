class Person{
    private String name;
    private int age;

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

    
}




public class q7 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();


        p1.setAge(25);
        p1.setName("Estaquio");

        p2.setName("J.David");
        p2.setAge(22);


        System.out.println("Name of the First Person is : "+p1.getName()); 
        System.out.println("Age of the First Person is : "+p1.getAge());

       System.out.println("Name of the Second Person is : "+p2.getName()); 
        System.out.println("Age of the Second Person is : "+p2.getAge());
    }
}
