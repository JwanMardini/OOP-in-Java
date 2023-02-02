package Task1;

public class WorkContacts extends AddressBook{
    String[] employerName;

    public String[] getEmployerName() {
        return employerName;
    }

    public WorkContacts(String firstName, String lastName, int mobileNumber, String[] employerName) {
        super(firstName, lastName, mobileNumber);
        this.employerName = employerName;
    }

    public void setEmployerName(String[] employerName) {
        this.employerName = employerName;
    }
}
