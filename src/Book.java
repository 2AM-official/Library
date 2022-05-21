public class Book {
    private String iSBN;
    private String title;
    private String author;
    private String category;
    private int numBook;
    private int numBookAva;

    // constructor
    public Book (String iSBN, String title, String author, String category, int numBook) {
        this.iSBN = iSBN;
        this.title = title;
        this.author = author;
        this.category = category;
        this.numBook = numBook;
        this.numBookAva = numBook;
    }

    // getters and setters
    public String getISBN() {
        return iSBN;
    }

    public void setISBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public int getNumBook() {
        return numBook;
    }

    public void setNumBook(int numBook) {
        this.numBook = numBook;
    }

    public int getNumBookAva() {
        return numBookAva;
    }

    public void setNumBookAva(int numBookAva) {
        this.numBookAva = numBookAva;
    }
}
