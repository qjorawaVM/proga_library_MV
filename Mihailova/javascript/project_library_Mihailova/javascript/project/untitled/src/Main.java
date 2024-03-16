import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean exit = false;
        ArrayList<PrintedBook> books = new ArrayList<>();
        PrintedBook pbk  = new PrintedBook("One Hundred Years of Solitude","Gabriel Garcia Marquez","Yes",1967,"Sudamericana");
        books.add(0,pbk);
        ArrayList<AudioBook> books1 = new ArrayList<>();
        AudioBook abk = new AudioBook("Never Too Late ","Danielle Steel","Yes","Samuel Richardson`s",4.7);
        books1.add(0,abk);
        ArrayList<ElectronicBook> books2 = new ArrayList<>();
        ElectronicBook ebk = new ElectronicBook("Harry Potter and the Philosopher`s Stone","J.K.Rowling","Not mentioned","PDF",5.3);
        books2.add(0,ebk);
        while (!exit) {
            System.out.println("\nWelcome to the Library Management System!");
            System.out.println("1. Add a printed book");
            System.out.println("2. Add an audio book");
            System.out.println("3.Add an electronic book");
            System.out.println("4. Remove a book");
            System.out.println("5. List all books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            int x = 1;
            switch (choice) {
                case 1:
                    Library library = new Library( "",  "", " ");
                    System.out.println("\nEnter book details:");
                    System.out.print("Title: ");
                    String title = scanner.next();
                    System.out.print("Author: ");
                    String author = scanner.next();
                    System.out.print("ISBN: ");
                    String ISBN = scanner.next();
                    System.out.print("Publication year: ");
                    int publicationYear = scanner.nextInt();
                    System.out.print("Publisher: ");
                    String publisher = scanner.next();
                    pbk.title = title;
                    pbk.author = author;
                    pbk.Isbn = ISBN;
                    pbk.publicationYear=publicationYear;
                    pbk.publisher = publisher;
                    books.add(x,pbk);
                    System.out.println("\nBook added successfully!");
                    x++;
                    break;
                case 2:
                    Library library1 = new Library( " ",  " ", " ");
                    System.out.println("\nEnter book details:");
                    System.out.print("Title: ");
                    String title1 = scanner.next();
                    System.out.print("Author: ");
                    String author1 = scanner.next();
                    System.out.print("ISBN: ");
                    String ISBN1= scanner.next();
                    System.out.print("Narrator: ");
                    String narrator=  scanner.next();
                    System.out.println("Lenght: ");
                    Double lenght = scanner.nextDouble();
                    abk.title = title1;
                    abk.author = author1;
                    abk.Isbn = ISBN1;
                    abk.narrator = narrator;
                    abk.length=lenght;
                    books1.add(1,abk);
                    System.out.println("\nBook added successfully!");
                    x++;
                    break;
                case 3:
                    Library library2 = new Library( " ",  " ", " ");
                    System.out.println("\nEnter book details:");
                    System.out.print("Title: ");
                    String title2 = scanner.next();
                    System.out.print("Author: ");
                    String author2 = scanner.next();
                    System.out.print("ISBN: ");
                    String ISBN2 = scanner.next();
                    System.out.print("File size: ");
                    int filesize = scanner.nextInt();
                    System.out.print("File format: ");
                    String format = scanner.next();
                    ebk.title = title2;
                    ebk.author = author2;
                    ebk.Isbn = ISBN2;
                    ebk.fileSize = filesize;
                    ebk.format = format;
                    books2.add(x,ebk);
                    System.out.println("\nBook added successfully!");
                    x++;
                    break;
                case 4:
                    System.out.print("Enter ISBN of the book to remove: ");
                    int ISBNToRemove = scanner.nextInt();
                    books.remove(ISBNToRemove);
                    break;
                case 5:
                    System.out.println("\nList of books:");
                    System.out.println(books);
                    System.out.println(books1);
                    System.out.println(books2);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }
        }
        try {
            FileWriter fw = new FileWriter("text.txt", true);
            fw.write(String.valueOf(books));
            fw.write("\n");
            fw.write(String.valueOf(books1));
            fw.write("\n");
            fw.write(String.valueOf(books2));
            fw.close();
        }catch (IOException e){
        }
    }
}