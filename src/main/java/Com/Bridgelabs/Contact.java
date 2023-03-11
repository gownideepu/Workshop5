package Com.Bridgelabs;

public class Contact {
    private String name;
    private String surname;
    private String address;
    private String city;
    private String state;
    private String ContactNumber;
    private String gmail;
    public Contact(String name, String surname, String address , String city, String state, String ContactNumber, String gmail){

            this.name = name;
            this.surname = surname;
            this.address = address;
            this.city = city;
            this.state = state;
            this.ContactNumber = ContactNumber;
            this.gmail=gmail;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
