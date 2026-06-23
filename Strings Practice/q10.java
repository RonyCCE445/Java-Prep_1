public class q10 {
    public static void main(String[] args) {
        String s1 = "Koustav";
        String s2 = " Chakraborty";
        StringBuffer s3 = new StringBuffer("Koustav");

        System.out.println("Using + : " +(s1+s2));

        s3.append(s2);

        System.out.println("Using StringBuffer and append(): "+s3);


    }
}
