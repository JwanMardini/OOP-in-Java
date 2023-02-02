package Task1;

public class PrivateContacts extends AddressBook{
    String nickName;

    public PrivateContacts(String firstName, String lastName, int mobileNumber, String nickName) {
        super(firstName, lastName, mobileNumber);
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

}
