package loan;

public class Address {

    public String city;

    public String area;

    public String street;

    public int pincode;


    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", street='" + street + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
