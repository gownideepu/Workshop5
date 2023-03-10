package Com.Bridgelabs;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AddressBook {
    static Scanner scanner = new Scanner(System.in);
    List<Contact> Contactlist = new ArrayList<>();

    void AddressBook(Contact contact) {
        Contactlist.add(contact);
    }

    void addContact() {
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter surname");
        String surname = scanner.next();
        System.out.println("Enter address");
        String address = scanner.next();
        System.out.println("Enter city");
        String city = scanner.next();
        System.out.println("Enter state");
        String state = scanner.next();
        System.out.println("Enter email");
        String email = scanner.next();
        System.out.println("Enter contactnumber");
        String contactnumber = scanner.next();

        Contact contact = new Contact(name,surname,address,city,state,email,contactnumber);
        AddressBook(contact);
    }
}

