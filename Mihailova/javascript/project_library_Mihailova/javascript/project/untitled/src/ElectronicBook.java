public class ElectronicBook extends Library {
    public String format;
    public double fileSize;
    public ElectronicBook(String title2, String author2, String isbn2, String format, double fileSize) {
        super(title2, author2, isbn2);
        this.format = format;
        this.fileSize = fileSize;
    }
    public String toString() {
        return
                "Electronic Book"+'\n'+ "Title: "+title2+'\n'+"Author: "+author2+'\n'+ "ISBN"+Isbn2+'\n'+"Format: "+format+'\n'+"File size(in MB): "+fileSize;
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public double getFileSize() {
        return fileSize;
    }
    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
}