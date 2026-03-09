class LibraryItem {

    String title;

    LibraryItem(String title){
        this.title = title;
    }

    void display(){
        System.out.println("Title: " + title);
    }

}

class Book extends LibraryItem {

    String author;

    Book(String title, String author){
        super(title);
        this.author = author;
    }

    void display(){
        super.display();
        System.out.println("Author: " + author);
    }

}

class IssuedBook extends Book {

    String issuedTo;

    IssuedBook(String title, String author, String issuedTo){
        super(title, author);
        this.issuedTo = issuedTo;
    }

    void display(){
        super.display();
        System.out.println("Issued To: " + issuedTo);
    }

}

public class libraryManagement {

    public static void main(String args[]){

        IssuedBook book = new IssuedBook("Java Programming","James Gosling","Rakesh");

        book.display();

    }

}