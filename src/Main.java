import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
          ArrayList<Pasport>pasports = new ArrayList<>();




        ArrayList<Person> people = new ArrayList<>();
        String num = scanner.nextLine();
        String num2= scanner.nextLine();
        people.add(new Person(scanner.nextLine(), scanner.nextLine(), LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()),Gender.valueOf(num), Country.valueOf(num2)));

        ArrayList<Pasport> pasportArrayList = new ArrayList<>();
        String name = scanner.nextLine();

        pasportArrayList.add(new Pasport(scanner.nextLine(), people.get(0),Country.valueOf(name),LocalDate.of(scanner.nextInt(), scanner.nextInt(),
                scanner.nextInt()),LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())));







        while (true){
            System.out.println("""
            >>>>>>>>>>>>>>>     Comands     <<<<<<<<<<<<<<
            0=> Whatsapp profilge kiruu
            1=> Passport aluu
            2=> Whatsapp ustanovka kyluu
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
                case 9:
                    System.out.println("~~~~~~~     Gender      ~~~~~~~~");
                    for (Gender g:Gender.values()) {
                        System.out.println(g);}
                    break;
                case 8:
                    System.out.println("~~~~~~~~~   Contry   ~~~~~~~~~");
                    for (Country c:Country.values()) {
                        System.out.println(c);}
                    break;
                case 1:
                    System.out.println("~~~~~~~~~       Whatsapp status      ~~~~~~~~~~~~");
                    for (WhatsapStatus w:WhatsapStatus.values()) {
                        System.out.println(w);}

            }
        }



        }



        }

