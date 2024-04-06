package swiggy;

public class Testswiggy {

    public static void main(String[] args) {
        Address address=new Address();
        address.housenumber="55156";
        address.area="sri ram nagar";
        address.street="1";
        address.pincode="508213";
        address.flatnumber="104";


        User user=new User();
        user.email="varun@gmail.com";
        user.mobileNumber="+919121558141";
        user.address=address;








        Resturant resturant=new Resturant();
        resturant.address=address;
        resturant.name="kaka 75";




    }
}
