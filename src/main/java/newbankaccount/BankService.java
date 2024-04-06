package newbankaccount;

import java.util.UUID;

public class BankService {

    public Passbook createaccount (User user){
    Passbook passbook = new Passbook();
    AddressNew addressNew = new AddressNew();
    addressNew.street="ram nagar";
    addressNew.pinCode="508213";
    addressNew.houseNumber="505";


    String name = user.firstName+" " +user.lastName;
    passbook.accountHolderName=name;
    passbook.userAddress=user.Address;
    passbook.bankAddress=addressNew;
    passbook.accountNumber=UUID.randomUUID().toString();
    passbook.ifscCode="UTIB0002110";

return passbook;
}


}
