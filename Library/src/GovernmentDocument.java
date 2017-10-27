import java.util.ArrayList;

public class GovernmentDocument extends LibraryItem {

    String governmentDocumentName = "";
    ArrayList<String> governmentDocumentNameAuthorNames = new ArrayList<>();
    int governmentDocumentPublicationYear = 0;
    boolean governmentDocumentRestricted = false;

    public GovernmentDocument(String governmentDocumentName, ArrayList<String> governmentDocumentNamepAuthorNames, int governmentDocumentPublicationYear, boolean governmentDocumentRestricted, String itemType, int itemId, int itemQuantityAvailabe, int itemQuantityBorrowed) {
        super(itemType, itemId, itemQuantityAvailabe, itemQuantityBorrowed);
        this.governmentDocumentName = governmentDocumentName;
        this.governmentDocumentNameAuthorNames = governmentDocumentNameAuthorNames;
        this.governmentDocumentPublicationYear = governmentDocumentPublicationYear;
        this.governmentDocumentRestricted = governmentDocumentRestricted;
    }


    public String getGovernmentDocumentName() {
        return governmentDocumentName;
    }

    public void setGovernmentDocumentName(String governmentDocumentName) {
        this.governmentDocumentName = governmentDocumentName;
    }

    public ArrayList<String> getGovernmentDocumentNameAuthorNames() {
        return governmentDocumentNameAuthorNames;
    }

    public void setGovernmentDocumentNameAuthorNames(ArrayList<String> governmentDocumentNameAuthorNames) {
        this.governmentDocumentNameAuthorNames = governmentDocumentNameAuthorNames;
    }

    public int getGovernmentDocumentPublicationYear() {
        return governmentDocumentPublicationYear;
    }

    public void setGovernmentDocumentPublicationYear(int governmentDocumentPublicationYear) {
        this.governmentDocumentPublicationYear = governmentDocumentPublicationYear;
    }

    public boolean getGovernmentDocumentRestricted() {
        return governmentDocumentRestricted;
    }

    public void setGovernmentDocumentRestricted(boolean governmentDocumentRestricted) {
        this.governmentDocumentRestricted = governmentDocumentRestricted;
    }

    @Override
    public String toString() {
        String governmentDocumentAuthorNamesString = "";
        for (int i = 0; i < getGovernmentDocumentNameAuthorNames().size(); i++) {
            governmentDocumentAuthorNamesString = governmentDocumentAuthorNamesString + getGovernmentDocumentNameAuthorNames().get(i);
            if (i < getGovernmentDocumentNameAuthorNames().size())
                governmentDocumentAuthorNamesString = governmentDocumentAuthorNamesString + ", ";
        }
        return getItemId() + " (" + getItemType() + ") - " + getGovernmentDocumentName() + " by " + governmentDocumentAuthorNamesString + " ("  + getGovernmentDocumentPublicationYear() + ") Restricted: " + getGovernmentDocumentRestricted();
    }
}