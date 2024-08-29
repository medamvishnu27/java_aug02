package library;
import java.util.*;
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}
class Library{
	private ArrayList<Book>books;
	public Library(){
		books=new ArrayList<>();
	}
	public void addBook(String title, String author) {
        books.add(new Book(title, author));
        System.out.println("Book added: " + title);
    }
	public void searchBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found: " + title);
        }
    }
	public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
	 public void removeBook(String title) {
	        boolean removed = false;
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                books.remove(book);
	                System.out.println("Book removed: " + title);
	                removed = true;
	                break;
	            }
	        }
	        if (!removed) {
	            System.out.println("Book not found: " + title);
	        }
	    }
	
}

public class Lib{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Library libb=new Library();
	boolean f=true;
	while(f){
		    System.out.println("Library Manegament");
			System.out.println("1.Add a book");
			System.out.println("2.Search for a Book");
			System.out.println("3.Display All Books");
			System.out.println("4.Remove a Book by Title");
			System.out.println("5.Exit");
			System.out.println("Enter option:");
			int a=sc.nextInt();
			sc.nextLine();
			switch(a) {
			case 1:
				System.out.println("Enter book title:");
				System.out.println("Enter book author:");
				String title=sc.next();
				String author=sc.next();
				libb.addBook(title,author);
				
				break;
			case 2:
				System.out.println("Enter book title to seach");
				String stitle=sc.nextLine();
				libb.searchBook(stitle);
				break;
			case 3:
				libb.displayAllBooks();
				break;
			case 4:
				System.out.println("Enter book title to remove");
				String rtitle=sc.nextLine();
				libb.removeBook(rtitle);
				break;
			case 5:
				System.out.println("Exiting the system.....");
				sc.close();
				f=false;
				//System.exit(0);
				break;
			default:
				System.out.println("Invalid choise....");
					
			}
		
				
	}
			


	}

	
}
