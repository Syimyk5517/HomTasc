import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {static Scanner scanner = new Scanner(System.in);
    public  static MethodIml methodIml = new MethodIml();
    public static Whatsapp whatsapp = new Whatsapp();
    public static Pasport pasport = new Pasport();
    public static void main(String[] args) {
          ArrayList<Pasport>pasports = new ArrayList<>();
          ArrayList<Whatsapp> whatsapps = new ArrayList<>();
          ArrayList<Contact> contacts = new ArrayList<>();
        whatsapp.setContacts(contacts);



        while (true){
            System.out.println("""
            >>>>>>>>>>>>>>>     Comands     <<<<<<<<<<<<<<
       
            2=> Passport aluu
            1=> Whatsapp ustanovka kyluu
            3=> Bazada passportu bar adamdardyn baaryn       
            4=> Message jonotuu
            5=> Add contact
            6=> Change status
            7=> get all whatsapp status
            8=> get all country
            9=> get all gender
            10=> get all whatsapp
            11=> get person by first name
            12=> getMessage
            
            Write comand: """);
            int number = scanner.nextInt();
            switch (number){
                case 1:
                    System.out.println(methodIml.installWhatsApp(whatsapps,pasports));

                    break;
                case 2:
                    System.out.println(methodIml.createPassport(pasports,pasport));

                    break;
                case 5:

                    break;
                case 9:
                    System.out.println("~~~~~~~     Gender      ~~~~~~~~");
                    for (Gender g:Gender.values()) {
                        System.out.println(g);}
                    break;
                case 8:
//                    methodIml.sob(messegs,whatsapps);
                    System.out.println("~~~~~~~~~   Contry   ~~~~~~~~~");
                    for (Country c:Country.values()) {
                        System.out.println(c);}
                    break;
                case 7:
                    System.out.println("~~~~~~~~~       Whatsapp status      ~~~~~~~~~~~~");
                    for (WhatsapStatus w:WhatsapStatus.values()) {
                        System.out.println(w);}
                      break;
                case 6:
                    getAllPasport(pasports);
                    break;
                case 10:
                    getaAllwhatsapp(whatsapps);
                    break;
                case 12:
                    System.out.println("Parol:");
                    String parol = new Scanner(System.in).nextLine();
                    for (Whatsapp w : whatsapps) {
                        if (parol.equalsIgnoreCase(w.getPasword())){
                            whatsAppCommands(whatsapp,whatsapps,methodIml);
                        }

                    }
            }

        }



        }
        public static  void getAllPasport(ArrayList<Pasport>pasports){
            for (Pasport p:pasports) {
            System.out.println(p);}
    }
    public static void getaAllwhatsapp(ArrayList<Whatsapp>whatsapps){
        for (Whatsapp w:whatsapps) {
            System.out.println(w);}

    }
        public static void whatsAppCatalog(){
            System.out.println("""
                1.Жеке каттар
                2.Контакт кошуу
                3.Статусту озгортуу
                """);
        }
    public static void whatsAppCommands(Whatsapp whatsapp, List<Whatsapp> whatsapps, MethodIml methodIml){
        whatsAppCatalog();
        int num = scanner.nextInt();
        switch (num){
            case 1:
                whatsapp.getContacts().forEach(System.out::println);
                for (int i = 0; i < whatsapp.getContacts().size(); i++) {
                    System.out.println(whatsapp.getContacts().get(i));
                    System.out.println("\n  " + whatsapp.getContacts().get(i).getMeseg());
                }
                methodIml.getMessage(whatsapps, whatsapp);
                break;
            case 2:
                System.out.println( methodIml.addContact(whatsapps,whatsapp));
                break;
            case 3:
                for (Whatsapp s:whatsapps) {
                 System.out.println("Sizfin uchurdagy statusunuz" +s.getWhatsapStatus());}
                 System.out.println("Izmenit da ili net");
                 String otvet2 = new  Scanner(System.in).nextLine();
                 if (otvet2.equalsIgnoreCase("da")){
                     System.out.println("Vybraite:");
                     for (WhatsapStatus wh:WhatsapStatus.values()) {
                         System.out.println(wh);
                     }
                     String tandoo = new  Scanner(System.in).nextLine();
                     for (Whatsapp p:whatsapps) {
                         p.setWhatsapStatus(WhatsapStatus.valueOf(tandoo));
                     }
                     System.out.println("Uspesho!");
                 }else break;

        }
//        }
    }
}



