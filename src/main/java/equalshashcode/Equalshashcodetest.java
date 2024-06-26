package equalshashcode;

public class Equalshashcodetest {
    public static void main(String[] args) {

       Address address1 =new Address();
        address1.area="sri ram nagar";
        address1.street="5";
        address1.flatNumber="505a";
        address1.pincode="508213";

        Address address2 =new Address();
        address2.area="sri ram nagar";
        address2.street="5";
        address2.flatNumber="505a";
        address2.pincode="508213";

        Address address3 =new Address();
        address3.area="sri ram nagar";
        address3.street="5";
        address3.flatNumber="505a";
        address3.pincode="508213";



        System.out.println("reflexive test starts here");
        System.out.println(address1.equals(address1));
        System.out.println("address1 hashcode = "+address1.hashCode());
        System.out.println("address2 hashcode =" +address2.hashCode());

        System.out.println("reflexive test ends here");

        System.out.println("symmetry starts here ");

        System.out.println(address1.equals(address2));
        System.out.println(address2.equals(address1));

        System.out.println("symmetry ends here ");

        System.out.println("transtive starts here ");


        System.out.println(address1.equals(address3));
        System.out.println(address3.equals(address2));
        System.out.println(address2.equals(address1));

        System.out.println("transtive ends here ");


        System.out.println("consistency starts here");

        System.out.println(address1.equals(address3));
        System.out.println(address1.equals(address3));
        System.out.println(address1.equals(address3));

        System.out.println("consistency ends here");

    }
}
