import java.util.ArrayList;

public class Map extends LibraryItem {

    String mapName = "";
    ArrayList<String> mapAuthorNames = new ArrayList<>();
    int mapPublicationYear = 0;
    String mapLocation = "";


    public Map(String mapName, ArrayList<String> mapAuthorNames, int mapPublicationYear, String mapLocation, String itemType, int itemId, int itemQuantityAvailabe, int itemQuantityBorrowed) {
        super(itemType, itemId, itemQuantityAvailabe, itemQuantityBorrowed);
        this.mapName = mapName;
        this.mapAuthorNames = mapAuthorNames;
        this.mapPublicationYear = mapPublicationYear;
        this.mapLocation = mapLocation;
    }


    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public ArrayList<String> getMapAuthorNames() {
        return mapAuthorNames;
    }

    public void setMapAuthorNames(ArrayList<String> mapAuthorNames) {
        this.mapAuthorNames = mapAuthorNames;
    }

    public int getMapPublicationYear() {
        return mapPublicationYear;
    }

    public void setMapPublicationYear(int mapPublicationYear) {
        this.mapPublicationYear = mapPublicationYear;
    }

    public String getMapLocation() {
        return mapLocation;
    }

    public void setMapLocation(String mapLocation) {
        this.mapLocation = mapLocation;
    }

    @Override
    public String toString() {
        String mapAuthorNamesString = "";
        for (int i = 0; i < getMapAuthorNames().size(); i++) {
            mapAuthorNamesString = mapAuthorNamesString + getMapAuthorNames().get(i);
            if (i < getMapAuthorNames().size())
                mapAuthorNamesString = mapAuthorNamesString + ", ";
        }
        return getItemId() + " (" + getItemType() + ") - " + getMapName() + " by " + mapAuthorNamesString + " (" + getMapLocation() + " " + getMapPublicationYear() + ")";
    }
}