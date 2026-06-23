class Book{

    String Title;
    String Author;
    double Price;


    Book()
    {
        System.out.println("Book is created using default constructor");
    }



    Book(String Title, String Author, double Price){

        this.Title = Title;
        this.Author = Author;
        this.Price = Price;


    }

    public void displaydetails()
    {
        System.out.println("Title of the Book: "+Title);
        System.out.println("Author of the Book: "+Author);
        System.out.println("Price of the Book: "+Price);


    }
}


public class q6 {
    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println();
        
        Book b2 = new Book("Khol Do", "Sadat Hassan Manto", 150.00);
        Book b3 = new Book("2000 leagues under the Sea", "Jules Verne", 250.00);

        

        b1.displaydetails();
        b2.displaydetails();
        b3.displaydetails();
    }
    
}
