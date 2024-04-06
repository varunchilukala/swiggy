package loan;

public class User {

    public String firstName;

    public String lastName;

    public String panNumber;

    public String dob;

 public Address address;


   public double loanammount;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", panNumber='" + panNumber + '\'' +
                ", dob='" + dob + '\'' +
                ", address=" + address +
                ", loanammount=" + loanammount +
                '}';
    }
}
