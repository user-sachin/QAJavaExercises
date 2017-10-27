public class Person {

    int personId = 0;
    String personNameFirst = "";
    String personNameLast = "";
    int personAge = 0;
    int personJoinDate = 0;
    String personAddressFirstLine = "";
    String personAddressSecondLine = "";
    String personAddressPostcode = "";

    public Person(int personId, String personNameFirst, String personNameLast, int personAge, int personJoinDate, String personAddressFirstLine, String personAddressSecondLine, String personAddressPostcode) {
        this.personId = personId;
        this.personNameFirst = personNameFirst;
        this.personNameLast = personNameLast;
        this.personAge = personAge;
        this.personJoinDate = personJoinDate;
        this.personAddressFirstLine = personAddressFirstLine;
        this.personAddressSecondLine = personAddressSecondLine;
        this.personAddressPostcode = personAddressPostcode;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonNameFirst() {
        return personNameFirst;
    }

    public void setPersonNameFirst(String personNameFirst) {
        this.personNameFirst = personNameFirst;
    }

    public String getPersonNameLast() {
        return personNameLast;
    }

    public void setPersonNameLast(String personNameLast) {
        this.personNameLast = personNameLast;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public int getPersonJoinDate() {
        return personJoinDate;
    }

    public void setPersonJoinDate(int personJoinDate) {
        this.personJoinDate = personJoinDate;
    }

    public String getPersonAddressFirstLine() {
        return personAddressFirstLine;
    }

    public void setPersonAddressFirstLine(String personAddressFirstLine) {
        this.personAddressFirstLine = personAddressFirstLine;
    }

    public String getPersonAddressSecondLine() {
        return personAddressSecondLine;
    }

    public void setPersonAddressSecondLine(String personAddressSecondLine) {
        this.personAddressSecondLine = personAddressSecondLine;
    }

    public String getPersonAddressPostcode() {
        return personAddressPostcode;
    }

    public void setPersonAddressPostcode(String personAddressPostcode) {
        this.personAddressPostcode = personAddressPostcode;
    }

    @Override
    public String toString() {
        return null;
    }
}
