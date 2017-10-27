import java.util.ArrayList;

public class LibraryItem implements CalculateAvailability {
    String itemType;
    int itemId;
    int itemQuantityAvailabe = 0;
    int itemQuantityBorrowed = 0;
    ArrayList<Book> listOfBooks = new ArrayList<Book>();
    ArrayList<Map> listOfMaps = new ArrayList<Map>();
    ArrayList<GovernmentDocument> listOfGovernmentDocuments = new ArrayList<GovernmentDocument>();


    public LibraryItem(){}


    public LibraryItem(String itemType, int itemId, int itemQuantityAvailabe, int itemQuantityBorrowed) {
        this.itemType = itemType;
        this.itemId = itemId;
        this.itemQuantityAvailabe = itemQuantityAvailabe;
        this.itemQuantityBorrowed = itemQuantityBorrowed;
    }

    public LibraryItem(ArrayList<Book> listOfBooks, ArrayList<Map> listOfMaps, ArrayList<GovernmentDocument> listOfGovernmentDocuments) {
        this.listOfBooks = listOfBooks;
        this.listOfMaps = listOfMaps;
        this.listOfGovernmentDocuments = listOfGovernmentDocuments;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getItemQuantityAvailabe() {
        return itemQuantityAvailabe;
    }

    public void setItemQuantityAvailabe(int itemQuantityAvailabe) {
        this.itemQuantityAvailabe = itemQuantityAvailabe;
    }

    public int getItemQuantityBorrowed() {
        return itemQuantityBorrowed;
    }

    public void setItemQuantityBorrowed(int itemQuantityBorrowed) {
        this.itemQuantityBorrowed = itemQuantityBorrowed;
    }

    @Override
    public int calculateAvailability(int itemQuantityAvailabe, int itemQuantityBorrowed) {
        return itemQuantityAvailabe-itemQuantityBorrowed;
    }

    //public abstract void printAvailability();

    public String checkOutItem(int itemId, int personId) {
        String checkOutReturnString = "Check out unsuccessful";
        for (int i = 0; i < listOfBooks.size(); i++) {
            if(listOfBooks.get(i).itemId == itemId){
                if(listOfBooks.get(i).getItemQuantityAvailabe()>0){
                    listOfBooks.get(i).setItemQuantityAvailabe(listOfBooks.get(i).getItemQuantityAvailabe()-1);
                    listOfBooks.get(i).setItemQuantityBorrowed(listOfBooks.get(i).getItemQuantityBorrowed()+1);
                    checkOutReturnString = "Successfully loaned";
                }
                else{
                    checkOutReturnString = "No more available to loan";
                }
            }
            else{
                checkOutReturnString = "Item not found";
            }
        }
        return checkOutReturnString;
    }


    public String checkInItem(int itemId, int personId) {
        String checkInReturnString = "Check in unsuccessful";
        for (int i = 0; i < listOfBooks.size(); i++) {
            if(listOfBooks.get(i).itemId == itemId){
                if(listOfBooks.get(i).getItemQuantityBorrowed()>0){
                    listOfBooks.get(i).setItemQuantityAvailabe(listOfBooks.get(i).getItemQuantityAvailabe()+1);
                    listOfBooks.get(i).setItemQuantityBorrowed(listOfBooks.get(i).getItemQuantityBorrowed()-1);
                    checkInReturnString = "Successfully checked iin";
                }
                else{
                    checkInReturnString = "This was never loaned";
                }
            }
            else{
                checkInReturnString = "Item not found";
            }
        }
        return checkInReturnString;
    }


}
