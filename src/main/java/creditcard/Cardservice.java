package creditcard;

import java.util.UUID;

public class Cardservice {

    public Sbiaccount cardcreation(User user) {
        Sbiaccount sbiaccount = new Sbiaccount();
        Address address = new Address();
        address.city = "suryapet";
        address.street = "kkroad";
        address.pinCode = 508213;
        address.flatNumber = "305A";


        String name = user.firstName + " " + user.lastName;
        sbiaccount.accountNumber = "123456789";
        sbiaccount.bankname = "sbi";
        sbiaccount.holderName = name;
        sbiaccount.ifscCode = "SBIN0006316";

        return sbiaccount;


    }
    public Visacard createcard(Sbiaccount sbiaccount) {
        Visacard visacard = new Visacard();
        visacard.cardHolderName =sbiaccount.holderName;
        visacard.cardNumber = "123456987412";
        visacard.cvv ="123";
        visacard.expirationdate ="12/03/2026";
        visacard.cardlimit="100000";
        visacard.availablebalnce="100000";
      return visacard;
    }



    }