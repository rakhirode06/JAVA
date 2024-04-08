import java.util.Scanner;


interface Library {
    void displayBooks();
    void borrowBook(String title) throws BookNotAvailableException;
    void returnBook(String title) throws BookNotFoundException;
    void addBook(Book book) throws LibraryFullException;
}

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}


class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}


class LibraryFullException extends Exception {
    public LibraryFullException(String message) {
        super(message);
    }
}

public class Librarybooks implements Library {
    static final int Maxbooks = 100;
    Book[] books;
    int numBooks;

    public class Book {
        String title;
        String author;
        boolean available;

        
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.available = true;
        }
    }

    
    public Librarybooks() {
        books = new Book[Maxbooks];
        numBooks = 0;
    }

    
    public void displayBooks() {
        System.out.println("Library Books:");
        for (int i = 0; i < numBooks; i++) {
            if (books[i] != null) {
                System.out.println(books[i].title + " by " + books[i].author);
            }
        }
    }

    
    public void borrowBook(String title) throws BookNotAvailableException {
        for (int i = 0; i < numBooks; i++) {
            if (books[i] != null && books[i].title.equalsIgnoreCase(title)) {
                if (books[i].available) {
                    books[i].available = false;
                    System.out.println("Borrowed: " + books[i].title);
                    return;
                } else {
                    throw new BookNotAvailableException("The book '" + title + "' is not available.");
                }
            }
        }
        throw new BookNotFoundException("Book '" + title + "' not found in the library.");
    }

    
    public void returnBook(String title) throws BookNotFoundException {
        for (int i = 0; i < numBooks; i++) {
            if (books[i] != null && books[i].title.equalsIgnoreCase(title)) {
                if (!books[i].available) {
                    books[i].available = true;
                    System.out.println("Returned: " + books[i].title);
                    return;
                } else {
                    throw new BookNotFoundException("The book '" + title + "' is not borrowed.");
                }
            }
        }
        throw new BookNotFoundException("Book '" + title + "' not found in the library.");
    }

    
    public void addBook(Book book) throws LibraryFullException {
        if (numBooks < Maxbooks) {
            books[numBooks++] = book;
            System.out.println("Book added successfully.");
        } else {
            throw new LibraryFullException("The library is full. Cannot add more books.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Librarybooks library = new Librarybooks();

        try {
            library.addBook(library.new Book("Book1", "Author1"));
            library.addBook(library.new Book("Book2", "Author2"));
            library.addBook(library.new Book("Book3", "Author3"));
        } catch (LibraryFullException e) {
            System.out.println(e.getMessage());
        }

        char choice;
        do {
            System.out.println("\nLibrary Menu");
            System.out.println("1. Display all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int menuChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (menuChoice) {
                    case 1:
                        library.displayBooks();
                        break;
                    case 2:
                        System.out.print("Enter the title of the book you want to borrow: ");
                        String borrowTitle = scanner.nextLine();
                        library.borrowBook(borrowTitle);
                        break;
                    case 3:
                        System.out.print("Enter the title of the book you want to return: ");
                        String returnTitle = scanner.nextLine();
                        library.returnBook(returnTitle);
                        break;
                    case 4:
                        System.out.println("Thank you for using the Library.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (BookNotAvailableException | BookNotFoundException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Do you want to perform another operation? Enter Y/N: ");
            choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline

        } while (Character.toUpperCase(choice) == 'Y');

        System.out.println("Exiting the Library.");
        scanner.close();
    }
}

