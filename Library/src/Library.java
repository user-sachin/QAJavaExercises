import java.util.ArrayList;

public class Library {



    public static void main(String[] args) {
        ArrayList<ArrayList<LibraryItem>> listOfItems = new ArrayList<ArrayList<LibraryItem>>();
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        ArrayList<Map> listOfMaps = new ArrayList<Map>();
        ArrayList<GovernmentDocument> listOfGovernmentDocuments = new ArrayList<GovernmentDocument>();


        ArrayList<String> bookAuthorNames = new ArrayList<String>();
        bookAuthorNames.add("Author1");
        bookAuthorNames.add("Author2");

        listOfBooks.add(new Book("Name1", bookAuthorNames, 2016, false, "book", 1, 12, 5));



        //listOfItems.add(listOfBooks);


    }




}
