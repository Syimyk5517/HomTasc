import java.util.List;

public class Whatsapp {
    private String phoneNumber;
    private final String image = "DEfolt ";
    private  String userName;
    private final WhatsapStatus whatsapStatus = WhatsapStatus.I_LOVE;

    public Whatsapp(String phoneNumber, String userName) {
        this.phoneNumber = phoneNumber;
        this.userName = userName;

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

    public WhatsapStatus getWhatsapStatus() {
        return whatsapStatus;
    }

    @Override
    public String toString() {
        return "Whatsapp{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", image='" + image + '\'' +
                ", userName='" + userName + '\'' +
                ", whatsapStatus=" + whatsapStatus +
                '}';
    }
}

