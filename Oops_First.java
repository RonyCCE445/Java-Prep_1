class Keyboard{
   private int keys ;
   private String Color ;

   public int getKeys() {
    return keys;
}

   public void setKeys(int keys) {
    this.keys = keys;
   }

   public String getColor() {
    return Color;
   }

   public void setColor(String color) {
    Color = color;
   }


    public Keyboard()
    {
        keys = 104;
        Color = "Black";
    }



    public void pressed ()
    {
        System.out.println("Signal sent to computer "+ Color );

    }

    public void throwIt(){
        System.out.println("Keyboard thrown");
        keys = 85;
    }
}




public class Oops_First {
    public static void main(String[] args) {
        Keyboard  obj = new Keyboard(); // Reference Variable and Object Creation
        obj.pressed();
        obj.throwIt();
        obj.setColor("White");
        obj.setKeys(85);
    

        System.out.println("Number of keys in keyboard: "+ obj.getKeys());

    }
}