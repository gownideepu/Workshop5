package Com.Bridgelabs;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressbook=new AddressBook();
        addressbook.AddressBookContact("Family",new Contact("Deepthi","Gowni","Madanapalle","Mpl","Aps","98772332","g@gmail.com"));
        addressbook.AddressBookContact("Family",new Contact("Priya","G","Madanapalle","Mp","Ap","987324272332","p@gmail.com"));
        addressbook.AddressBookContact("Friend",new Contact("Ammu","G","Madanapalle","M","A","9873242","aaM@gmamil.com"));

        addressbook.showContact();
        addressbook.fileWriter();

    }
}
