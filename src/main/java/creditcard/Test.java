package creditcard;

public class Test { public static void main(String[] args) {


        User user =new User();
        Address address = new Address();
        address.city="suryapet";
        address.pinCode=508123;
        address.street="sriramnagar";
        address.flatNumber="5050";



        user.firstName = "chilukala";
        user.lastName = "saivarun";
        user.adharNumber = "4132 7894 4561";
        user.panNumber = "BWEJ45F002";
        user.dob = "13/03/2000";
        user.mobileNumber = "9121558141";
        user.address= address;


        Cardservice cardservice =new Cardservice();

        System.out.println(  cardservice.createcard(cardservice.cardcreation(user)));














    }
}
