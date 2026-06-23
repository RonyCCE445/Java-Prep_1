class Book{
    String Title;
    String Author;
    boolean isIssued = false;

    Book(String Title, String Author){
        this.Title = Title;
        this.Author = Author;
        
    }

    void displayBook(){

    
        System.out.println("Book: "+ Title);
        System.out.println("Author: "+Author);
        if(isIssued== false){
            System.out.println("Status: Available");
        }
        else{
            System.out.println("Status: Unavailable");
        }
    }

    void issueBook() {

    if(!isIssued) {
        isIssued = true;
        System.out.println("Book Issued Successfully");
    }
    else {
        System.out.println("Book is already issued");
    }
}

    void returnBook() {

    if(isIssued) {
        isIssued = false;
        System.out.println("Book Returned Successfully");
    }
    else {
        System.out.println("This book was not issued");
    }
}

}

class Student{
    String name;
    int rollNo;

    void displayStudent(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Roll No: "+rollNo);
    }
}

class Library{
    Book[]books;
    int bookCount;

    Library(){
        books = new Book[100];
        bookCount = 0;
    }

    void addBook(Book book){
        books[bookCount] = book;

        bookCount++;

    }
    void displayBooks(){

        for(int i = 0;i<bookCount;i++){
            books[i].displayBook();
            System.out.println();
        }
    }

    void searchBook(String title){

        boolean found = false;
        for (int i = 0; i<bookCount; i++){

            if(books[i].Title.equalsIgnoreCase(title)){
                System.out.println("Book Found: ");
                books[i].displayBook();
                found = true;
                break;

            }
        }

            if(!found){
                System.out.println("Book Not Found");
                
            }
    }
    
}




public class Library_Management {
    public static void main(String[] args) {
        Library l1 = new Library();
        Book b1 = new Book ("Harry Potter", "JK Rowling");
        Book b2 = new Book("The Alchemist", "Paulo Coelho");
        Book b3 = new Book ("1984","George Orwell");

        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(b3);

        b1.issueBook();
        System.out.println();
        b1.issueBook();
        System.out.println();
        b2.returnBook();
        System.out.println();
        b1.returnBook();

        //l1.displayBooks();

        System.out.println();

        l1.searchBook("1984");
    
    }
}
