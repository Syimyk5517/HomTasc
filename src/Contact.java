import java.util.List;

public class Contact {
    private String phoneNumber;
    private String fullname;
    private List<String> meseg;

    public Contact(String phoneNumber, String fullname) {
        this.phoneNumber = phoneNumber;
        this.fullname = fullname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public List<String> getMeseg() {
        return meseg;
    }

    public void setMeseg(List<String> meseg) {
        this.meseg = meseg;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", fullname='" + fullname + '\'' +
                ", meseg=" + meseg +
                '}';
    }
}
