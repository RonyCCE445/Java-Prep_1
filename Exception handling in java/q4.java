import java.io.FileNotFoundException;
import java.io.FileReader;
class q4{
    public static void main(String[] args) {
        try{
        FileReader fr = new FileReader("abc.txt");
    }catch(FileNotFoundException e){
        System.out.println("File Not");

    }
    }
}