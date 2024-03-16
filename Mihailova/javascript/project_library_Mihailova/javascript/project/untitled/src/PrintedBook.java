public class PrintedBook extends Library {
    public int publicationYear;
    public String publisher;
    public String author;
    public PrintedBook(String title, String author, String Isbn, int publicationYear, String publisher) {
        super(title, author, Isbn);
  this.publicationYear=publicationYear;
        this.publisher = publisher;
    }
    public String toString() {
        return
                "Printed Book "+'\n'+ "Title: "+title+'\n'+ "Author: "+author+'\n'+ "ISBN: "+Isbn+'\n'+ "Publication year: "+publicationYear+'\n'+"Publisher: "+publisher;
    }
}


