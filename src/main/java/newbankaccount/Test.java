package newbankaccount;

public class Test {
    public static void main(String[] args) {


        User user =new User();
        AddressNew userAddress = new AddressNew();

        userAddress.houseNumber="305";
        userAddress.pinCode="508123";
        userAddress.street="sriramnagar";


        user.firstName="chilukala";
        user.lastName="saivarun";
        user.dob="13/03/2000";
        user.mobleNumber="9121558141";
        user.Address = userAddress;

    BankService bankService =new BankService();
    Passbook passbook = bankService.createaccount( user);










    }
}
