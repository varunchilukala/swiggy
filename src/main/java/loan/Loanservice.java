package loan;

import java.util.UUID;

public class Loanservice {



    public Account loancreation (User user){
        Account account =new Account();
        Address address =new Address();
        address.city ="suryapet";
        address.area="kkroad";
        address.street="srinagar";
        address.pincode=508123;


        String name = user.firstName+" "+user.lastName;
        account.accountNumber = UUID.randomUUID().toString();
        account.bankName="sbi";
        account.ifscCode="SBIN0006316";
        account.cibilscore=750;

        return account;

    }
    public Loanrequirements createloan(Account account){
        Loanrequirements loanrequirements =new Loanrequirements();
        loanrequirements.empId="HD12345";
        loanrequirements.panNumber="AWJ52000A";
        loanrequirements.monthlyIncome=1500000;
        loanrequirements.collateral="landdocuments";

                return loanrequirements;

    }




}
