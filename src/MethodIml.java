import java.security.Signature;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MethodIml implements  Method {


    @Override
    public String createPassport(List<Pasport> passports,Pasport pasport) {
                Scanner scanner = new Scanner(System.in);
                Scanner scanner2 = new Scanner(System.in);
                System.out.print("ID: ");
                String id = scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Fuulname: ");
                String fullNAme = scanner.next();
                System.out.print("Tuulgan kunu: ");
                String data = new Scanner(System.in).nextLine();
                int year = Integer.parseInt(data.substring(0, 4));
                int month = Integer.parseInt(data.substring(5, 7));
                int day = Integer.parseInt(data.substring(8, 10));
                System.out.print("Gender: ");
                String gender = scanner2.nextLine();
                System.out.print("Country: ");
                String country = scanner2.nextLine();
                System.out.print("Date of expirty: ");
                String dataOfExpirty = new Scanner(System.in).nextLine();
                int dataOfExpirtyYear = Integer.parseInt(dataOfExpirty.substring(0, 4));
                int dataOfExpirtyMonth = Integer.parseInt(dataOfExpirty.substring(5, 7));
                int dataOfExpirtyDay = Integer.parseInt(dataOfExpirty.substring(8, 10));
                passports.add(new Pasport(id, new Person(name, fullNAme, LocalDate.of(year, month, day), Gender.valueOf(gender.toUpperCase()),
                        Country.valueOf(country.toUpperCase())), LocalDate.of(dataOfExpirtyYear, dataOfExpirtyMonth, dataOfExpirtyDay)));
                System.out.println("Вы успешно получили паспорт!");
        for (Pasport p:passports) {
            System.out.println(p);
        }

        return "";

    }
        @Override
    public String installWhatsApp(List<Whatsapp> whatsapps,List<Pasport>pasports) {
            System.out.print("Id: ");
            String id = new Scanner(System.in).nextLine();
            System.out.print("Phone number: ");
            String phoneNumber = new Scanner(System.in).nextLine();
            System.out.print("User name: ");
            String userNAme = new Scanner(System.in).nextLine();
            System.out.print("Pasword: ");
            String pasword = new Scanner(System.in).nextLine();
//            for (Pasport p:pasports) {
//                if(p.getId().equalsIgnoreCase(id)){
       whatsapps.add(new Whatsapp(id,phoneNumber,userNAme,pasword));
                    System.out.println( "WhatsApp successfully installed!");
            for (Whatsapp w:whatsapps) {
                System.out.println(w);}
//                }else {
//                    System.out.println("Myndai iddegi adam jok!");
//                }
//            }

       return "";
    }

    @Override
    public String addContact(List<Whatsapp>whatsappList,Whatsapp whatsapp) {
        System.out.print("Phone number: ");
        String phoneNumber = new  Scanner(System.in).nextLine();
        for (Whatsapp w : whatsappList) {
            if (phoneNumber.equalsIgnoreCase(w.getPhoneNumber())){
                System.out.println("""
                        Dobavit? 
                        yes/no""");
                String tandoo = new  Scanner(System.in).nextLine();
                if (tandoo.equalsIgnoreCase("yes")){
                    System.out.println("Uspeshno!");
                     whatsappList.add(new Contact(whatsapp.getPhoneNumber(),whatsapp.getUserName()));
                }
            }
            }


        return "";
    }

    @Override
    public String getMessage(List<Whatsapp>whatsapps,Whatsapp whatsapp) {
        Scanner scanner = new Scanner(System.in);
        String message = "";
        System.out.println("Кимге кат жонотосуз? ");
        String userName = scanner.nextLine();
        for (Contact  c : whatsapp.getContacts()) {
            if (userName.equals(c.getFullname())){
                System.out.println("Контакт " + c.getFullname() + " табылды");
                while (true){
                    Scanner scanner1 = new Scanner(System.in);
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.print("Sms жазын:");
                    message = whatsapp.getUserName() + ": " + scanner1.nextLine();
                    System.out.println("Жонотуу (yes/no)?");
                    String otvet = scanner2.nextLine();
                    if (otvet.equalsIgnoreCase("yes")){
                        System.out.println(whatsapp.getUserName() + ":" + message);
                        c.getMeseg().add(message);
                        for (Whatsapp w : whatsapps) {
                            if (w.getContacts() != null){
                                for (Contact contact: w.getContacts()) {
                                    if (contact.getPhoneNumber().trim().equals(whatsapp.getPhoneNumber())){
                                        for (Contact myContacty : whatsapp.getContacts()) {
                                            if (w.getPhoneNumber().trim().equals(myContacty.getPhoneNumber())){
                                                contact.getMeseg().add(message);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }else {
                        break;
                    }
                }
            }else {
                System.out.println("Myndai kontakt jok!");
                break;
            }
        }
        return message;


    }
}



























//        System.out.println("VAtsap parolun jazynyz:");
//        String otvet = new Scanner(System.in).nextLine();
//        for (Whatsapp pas:whatsapps) {
//            if (otvet.equalsIgnoreCase(pas.getPasword())){
//                if (messegs.isEmpty()){
//                System.out.println("KimGe sns jazasyn");
//                     String otvet2 = new Scanner(System.in).nextLine();
//                for (Contact c:contacts) {
//                  if (otvet2.equalsIgnoreCase(c.getFullname())){
//                      while (true){
//                          System.out.print("Sms jazynyz:");
//                          String sms = new Scanner(System.in).nextLine();
//                          System.out.print("Otpravit da ili net?");
//                          String joop3 = new  Scanner(System.in).nextLine();
//                          if (joop3.equalsIgnoreCase("da")){
//                              System.out.println(pas.getUserName() + ":" + sms);
//                              messegs.add(new Messeg(pas.getUserName(),sms));
//                          }else break;
//                  }
//
//                }else {
//                      System.out.println("Sizdin kontacta mynday adam jok!");
//                  }
//
//            }
//
//        }
//            }}}
//
//    @Override
//    public void sob(List<Messeg> messegs, List<Whatsapp> whatsapps) {
//        System.out.println("Whatsap parol");
//        String parol = new Scanner(System.in).nextLine();
//        for (Whatsapp w:whatsapps) {
//            if (parol.equalsIgnoreCase(w.getPasword())){
//                if (messegs.isEmpty()){
//                    System.out.println("Net novyx sobshenia");
//                }
//                else {
//                    for (Messeg m:messegs) {
//                        System.out.println(m);
//
//                    }
//                }
//            }
//
////        }
//    }
//}














































//         while (true){
//             System.out.print("""
//               1=> Izmenit profil najimite ==> 1
//               2=> Posmotret sobshenia najimete ==>2
//               3=> Dobavit kontakt najimite 3==>
//               4=> Otpravit sobshenia""");
//             int num = new  Scanner(System.in).nextInt();
//             if (num==1){
//                 for (Whatsapp s:whatsapps) {
//                 System.out.print("Sizfin uchurdagy statusunuz" +s.getWhatsapStatus());}
//                 System.out.print("Izmit da ili net");
//                 String otvet2 = new  Scanner(System.in).nextLine();
//                 if (otvet2.equalsIgnoreCase("da")){
//                     System.out.println("Vybraite:");
//                     for (WhatsapStatus wh:WhatsapStatus.values()) {
//                         System.out.println(wh);
//                     }
//                     String tandoo = new  Scanner(System.in).nextLine();
//                     for (Whatsapp p:whatsapps) {
//                         p.setWhatsapStatus(WhatsapStatus.valueOf(tandoo));
//                     }
//                     System.out.println("Uspesho!");
//                 }else break;
//             } else if (num==2) {
//                 if (messegs.isEmpty()){
//                     System.out.println("Net novyx soobshenia");
//                 }else {
//                     for (Messeg m:messegs) {
//                         System.out.println(m);}
//                 System.out.println("Otvetit sobshenia da ili net");
//                    String joop = new  Scanner(System.in).nextLine();
//                     if (joop.equalsIgnoreCase("da")){
//                         while (true){
//                             System.out.print("Sms jazynyz:");
//                             String sms = new Scanner(System.in).nextLine();
//                             System.out.print("Otpravit da ili net?");
//                             String joop2 = new  Scanner(System.in).nextLine();
//                             if (joop2.equalsIgnoreCase("da")){
//                                 System.out.println(whatsapp.getUserName() + ":" + sms);
//                                 messegs.add(new Messeg(sms));
//                             }else break;
//                         }
//                     }
//                 }
//             } else if (num == 3) {
//                 System.out.println("Tel nomerin jaz :");
//                 String phoneNumber = new  Scanner(System.in).nextLine();
//                 for (Whatsapp tel:whatsapps) {
//                     if (phoneNumber.equalsIgnoreCase(tel.getPhoneNumber())){
//                         System.out.println("Koldonuuchunun aty :" + tel.getUserName());
//                         System.out.print("dobavit da ili net?");
//                         String otvet3 = new  Scanner(System.in).nextLine();
//                         if (otvet3.equalsIgnoreCase("da")){
//                             contacts.add(new Contact(tel.getPhoneNumber(),tel.getUserName()));
//                             System.out.println("Kontakt uspeshno soxranen!");
//                         }else break;
//                     }else {
//                         System.out.println("Mynday nomerdegi adam tabylgan jok!");
//                         break;
//                     }
//
//                 }
//
//             } else if (num == 4) {
//                 if (contacts.isEmpty()){
//                     System.out.println("Contact tabylgan jok");
//                     System.out.print("dobavit Contakt  da ili net?");
//                     String otvet2 = new  Scanner(System.in).nextLine();
//                     for (Whatsapp tel:whatsapps) {
//                     if (otvet2.equalsIgnoreCase("da")){
//                         contacts.add(new Contact(tel.getPhoneNumber(),tel.getUserName()));
//                         System.out.println("Kontakt uspeshno soxranen!");
//                         while (true){
//                             System.out.print("Sms jazynyz:");
//                             String sms = new Scanner(System.in).nextLine();
//                             System.out.print("Otpravit da ili net?");
//                             String joop2 = new  Scanner(System.in).nextLine();
//                             if (joop2.equalsIgnoreCase("da")){
//                                 System.out.println(whatsapp.getUserName() + ":" + sms);
//                                 messegs.add(new Messeg(sms));
//                             }else break;
//                         }
//                     }else break;
//                 }
//
//             }else {
//                     for (Contact c:contacts) {
//                         System.out.println(c);
//                         System.out.println("Kimge sms jazgynyz kelip jatat");
//                         String joop2 = new  Scanner(System.in).nextLine();
//                         if (joop2.equalsIgnoreCase(c.getFullname())){
//                             while (true){
//                                 System.out.print("Sms jazynyz:");
//                                 String sms = new Scanner(System.in).nextLine();
//                                 System.out.print("Otpravit da ili net?");
//                                 String joop3 = new  Scanner(System.in).nextLine();
//                                 if (joop3.equalsIgnoreCase("da")){
//                                     System.out.println(whatsapp.getUserName() + ":" + sms);
//                                     messegs.add(new Messeg(sms));
//                                 }else break;
//                             }
//
//                         }else {
//                             System.out.println("Sizde mynday kontakt jok");
//                             break;
//                         }
//
//                     }
//
//                 }
//            }
//        }}
































//        System.out.print("Whatsap parol: ");
//        String pasword = new Scanner(System.in).nextLine();
//        System.out.print("Kimge sms jazgyn kelip jatat atyn jaz:");
//        String userNAme = new Scanner(System.in).nextLine();
//        while (true){
//            for (Contact c:contacts) {
//        if (pasword.equalsIgnoreCase(c.getWhatsapp().getPasword())){
//                if (userNAme.equalsIgnoreCase(c.getFullname())) {
//                    for (Messeg m : messegs) {
//                        System.out.println(c.getFullname() + ":" + m.getMessege());
//                    }
//                    while (true) {
//                        System.out.print("Sms jaz:");
//                        String sms = new Scanner(System.in).nextLine();
//                        System.out.println("""
//                                Otpravit sms?
//                                yes/no""");
//                        String otvet = new Scanner(System.in).nextLine();
//                        if (otvet.equalsIgnoreCase("yes")) {
//                            System.out.println(whatsapp.getUserName() + ":" + sms);
//                            messegs.add(new Messeg(sms));
//                        } else break;
//
//                    }
//                }else {
//
//                        while (true) {
//                            System.out.print("Sms jaz:");
//                            String sms = new Scanner(System.in).nextLine();
//                            System.out.println("""
//                                    Otpravit sms?
//                                    yes/no""");
//                            String otvet = new Scanner(System.in).nextLine();
//                            if (otvet.equalsIgnoreCase("yes")) {
//                                System.out.println(whatsapp.getUserName() + ":" + sms);
//                                messegs.add(new Messeg(sms));
//                            } else break;
//                        }}}}}
//            }





