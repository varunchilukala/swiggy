package bank;


import newbankaccount.User;

public class Testbank {

    public static void main(String[] args) {

      //  User user = new user();
      //  user.accountnumber="789566235";
        //user.username="saivarun";
        //user.ifsccode="AB10052";
        //user.blance="2000";
       // user.password="123456";


        Card card = new Card();
       // card.account=account;
        card.cardNumber="1234 5697 7562";
        card.cvv="123";
        card.username="saivarun";

        Atm atm = new Atm();
        atm.location="suryapet";
        atm.balnce=2000;
        atm.machineId="ad123456";

        Transcation transcation = new Transcation();
        transcation.atm=atm;
        transcation.card=card;
        transcation.transcationId="123456789";
        transcation.withdrawlamount=1000;



    }
}
