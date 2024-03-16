public class AudioBook extends Library {
    public String narrator;
    public double length;
    public AudioBook(String title1, String author1, String isbn1, String narrator, double length) {
        super(title1, author1, isbn1);
        this.narrator = narrator;
        this.length = length;
    }
    public String getNarrator() {
        return narrator;
    }
    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public String toString() {
        return
               "Audio Book"+'\n'+ "Narrator: "+ narrator + '\n'+ "Lenght: "+ length+ '\n'+ "Title: "+title1+ '\n'+ "Author: "+author1+'\n'+"ISBN: "+ ISBN1;
    }
}