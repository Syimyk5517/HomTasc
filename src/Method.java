import java.util.List;
import java.util.Stack;

public interface Method {


    String createPassport(List<Pasport> passports,Pasport pasport);
    String installWhatsApp(List<Whatsapp> whatsapps,List<Pasport>pasports);
    String addContact(List<Whatsapp> whatsappList,Whatsapp whatsapp);
    String getMessage (List<Whatsapp> whatsapps,Whatsapp whatsapp);

}
