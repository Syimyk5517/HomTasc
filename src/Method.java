import java.util.List;
import java.util.Stack;

public interface Method {


    String createPassport(List<Pasport> passports);
    String installWhatsApp(List<Whatsapp> users);
    String addContact(List<Whatsapp> users, Whatsapp whatsApp);
    void getMessage (List<Contact> contacts, Whatsapp myUser);
}
