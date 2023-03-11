package Com.Bridgelabs;

import java.io.*;
import java.nio.Buffer;
import java.util.*;
public class AddressBook {
    static Scanner src = new Scanner(System.in);
    public static Map<String, ArrayList<Contact>> addressBook = new HashMap<>();

    public void AddressBookContact(String addressBookName, Contact contact) {
        ArrayList<Contact> addressBookDetails = addressBook.getOrDefault(addressBookName, new ArrayList<Contact>());
        addressBookDetails.add(contact);
        addressBook.put(addressBookName, addressBookDetails);
    }

    public void showContact(){
        for (Map.Entry<String, ArrayList<Contact>> ent: addressBook.entrySet()){
            String key=ent.getKey();
            ArrayList<Contact> val=ent.getValue();
            System.out.println(key + " \n");
            for (Contact  cont: val ){
                System.out.println(cont.getName());
                System.out.println(cont.getSurname());
                System.out.println(cont.getAddress());
                System.out.println(cont.getContactNumber());
                System.out.println(cont.getCity());
                System.out.println(cont.getState());
                System.out.println(cont.getGmail());
            }
        }
    }
    public void fileWriter() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\eclips workspace\\WorkShop\\src\\main\\java\\Com\\Bridgelabs\\AddressBook"));
            for (Map.Entry<String, ArrayList<Contact>> ent: addressBook.entrySet()) {
                String key = ent.getKey();
                ArrayList<Contact> val = ent.getValue();
                writer.write(key );
                writer.newLine();
                for (Contact  cont: val ){
                    writer.write(cont.getName()+ " ");
                    writer.write(cont.getSurname()+ " ");
                    writer.write(cont.getContactNumber()+ " ");
                    writer.write(cont.getAddress()+ " ");
                    writer.write(cont.getCity()+ " ");
                    writer.write(cont.getState()+ " ");
                    writer.write(cont.getGmail()+ " ");
                    writer.write(" \n");
                }
            }
            writer.flush();
            writer.close();
        }catch (IOException e){
            System.out.println(e);

        }
    }

}