package equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class Setdemo {
    public static void main(String[] args) {

        Set<Car> carSet = new HashSet<>();

        Car car1 = new Car();
        car1.name="merceds";

        Car car2 = new Car();
        car2.name="merceds";

        carSet.add(car1);
        carSet.add(car2);


        System.out.println(carSet);


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

        Set<Address> addressSet = new HashSet<>();
        addressSet.add(address1);
        addressSet.add(address2);
        addressSet.add(address3);

        System.out.println(addressSet);

    }
}
