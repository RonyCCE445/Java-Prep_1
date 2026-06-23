import java.util.Vector;

public class vector1 {
    public static void main(String[] args) {
        Vector <Integer> v = new Vector<>();
        System.out.println("Capacity = "+v.capacity());
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        System.out.println("Vector : " +v);


        System.out.println("Size : "+v.size());
    }
}
