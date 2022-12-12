import java.util.ArrayList;
import java.util.List;

public class Whatsapp {
    private String id;
    private String phoneNumber;
    private final String image = "DEfolt ";
    private String userName;
    private String pasword;
    private  WhatsapStatus whatsapStatus = WhatsapStatus.I_LOVE;
    private List<Contact> contacts;

    public void addContact(Contact contact){
        if (contacts==null){
            contacts=new ArrayList<>();
        }
        contacts.add(contact);
    }

//    private List<Group> groups;
//
//    public void addGroups(Group group){
//        if (groups == null){
//            groups = new ArrayList<>();
//        }
//        groups.add(group);
//    }

    public Whatsapp() {
    }

    public Whatsapp(String id, String phoneNumber, String userName, String pasword) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.pasword = pasword;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImage() {
        return image;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public WhatsapStatus getWhatsapStatus() {
        return whatsapStatus;
    }

    public void setWhatsapStatus(WhatsapStatus whatsapStatus) {
        this.whatsapStatus = whatsapStatus;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Whatsapp" +
                "\nId:" + id +
                "\nPhone number:" + phoneNumber +
                "\nImage:" + image +
                "\n User name:" + userName +
                "\nWhatsapp status:" + whatsapStatus +
                "\nContactc:" + contacts ;
    }
}


