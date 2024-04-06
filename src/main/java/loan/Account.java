package loan;

public class Account {

    public String bankName;

    public String accountNumber;

    public String ifscCode;

    public int cibilscore;


    @Override
    public String toString() {
        return "Account{" +
                "bankName='" + bankName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", cibilscore=" + cibilscore +
                '}';
    }
}
