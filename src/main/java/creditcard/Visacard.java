package creditcard;

import java.util.Date;

public class Visacard {
     public String cardHolderName;

     public String cardNumber;

     public String expirationdate;

     public String cvv;


     public String cardlimit;

     public String availablebalnce;



     @Override
     public String toString() {
          return "Visacard{" +
                  "cardHolderName='" + cardHolderName + '\'' +
                  ", cardNumber='" + cardNumber + '\'' +
                  ", expirationdate='" + expirationdate + '\'' +
                  ", cvv='" + cvv + '\'' +
                  '}';
     }
}
