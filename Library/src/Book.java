import java.util.ArrayList;

public class Book extends LibraryItem {

    String bookName = "";
    ArrayList<String> bookAuthorNames = new ArrayList<>();
    int bookPublicationYear = 0;
    boolean bookAdult = false;



    public Book(String bookName, ArrayList<String> bookAuthorNames, int bookPublicationYear, boolean bookAdult, String itemType, int itemId, int itemQuantityAvailabe, int itemQuantityBorrowed) {
        super(itemType, itemId, itemQuantityAvailabe, itemQuantityBorrowed);
        this.bookName = bookName;
        this.bookAuthorNames = bookAuthorNames;
        this.bookPublicationYear = bookPublicationYear;
        this.bookAdult = bookAdult;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public ArrayList<String> getAuthorNames() {
        return bookAuthorNames;
    }

    public void setAuthorNames(ArrayList<String> bookAuthorNames) {
        this.bookAuthorNames = bookAuthorNames;
    }

    public int getBookPublicationYear() {
        return bookPublicationYear;
    }

    public void setBookPublicationYear(int bookPublicationYear) {
        this.bookPublicationYear = bookPublicationYear;
    }

    public boolean getBookAdult() {
        return bookAdult;
    }

    public void setBookAdult(boolean bookAdult) {
        this.bookAdult = bookAdult;
    }




    public void updateBook(String bookName, ArrayList<String> bookAuthorNames, int bookPublicationYear, boolean bookAdult, String itemType, int itemId, int itemQuantityAvailabe, int itemQuantityBorrowed) {

    }




    @Override
    public String toString() {
        String bookAuthorNamesString = "";
        for (int i = 0; i < getAuthorNames().size(); i++) {
            bookAuthorNamesString = bookAuthorNamesString + getAuthorNames().get(i);
            if (i < getAuthorNames().size())
                bookAuthorNamesString = bookAuthorNamesString + ", ";
        }
        return getItemId() + " (" + getItemType() + ") - " + getBookName() + " by " + bookAuthorNamesString + " (" + getBookPublicationYear() + ")";
    }
}