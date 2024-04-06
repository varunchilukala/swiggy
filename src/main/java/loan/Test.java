package loan;

public class Test {

    public static void main(String[] args) {

        User user =new User();
        Address address=new Address();
        address.city="suryapet";
        address.area="tirumalanagar";
        address.street="no:-05";
        address.pincode=508213;


        user.firstName="chilukala";
        user.lastName="saivarun";
        user.dob="13/03/2000";
        user.panNumber="AWJ52000A";
        user.address=address;
        user.loanammount=100000;



        Loanservice loanservice =new Loanservice();
      //  System.out.println ( loanservice.createloan(loanservice.loancreation(user)));
        System.out.println(user.toString());




    }
}
