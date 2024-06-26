package swiggy1;

import java.util.Scanner;

public class SwiggyTest {
    public static void main(String[] args) {

//        Swiggyservice swiggyservice =new Swiggyservice();
//        swiggyservice.getresturant();
//
//        Scanner input = new Scanner(System.in);
//
//
//        System.out.print("Enter your resturant");
//
//        String name = input.nextLine();
//
//        System.out.println("resturant name"+name);




        Address address1 =new Address();
        address1.area="sri ram nagar";
        address1.roadNumber="5";
        address1.FlatNumber="505a";

        Address address2 =new Address();
        address2.area="sri ram nagar";
        address2.roadNumber="5";
        address2.FlatNumber="505a";


        Address address3 =new Address();
        address3.area="sri ram nagar";
        address3.roadNumber="5";
        address3.FlatNumber="505a";

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