class Animal{

    void sound(){
        System.out.println("Animals Makes sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat Meows");
    }
}

class Cow extends Animal{
    @Override
    void sound(){
        System.out.println("Cow Moos");
    }
}


public class q13 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1= new Dog();
        Cat c1 = new Cat();
        Cow co1 = new Cow();



        a1.sound();
        d1.sound();
        c1.sound();
        co1.sound();
    }
    
}
