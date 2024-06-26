package equalshashcode;

import java.util.Objects;

public class Address {

public String street;

public String area;

public String pincode;

public String flatNumber;

    public boolean equals(Object obj) {
        if (this == obj){
        return true;
        }

        if (this.getClass() != obj.getClass()){
            return false;

        }

        Address address =  (Address) obj;

        return this.area.equals(address.area)
                && this.street.equals(address.street)
                && this.pincode.equals(address.pincode)
                && this.flatNumber.equals(address.flatNumber);



    }

    @Override
    public int hashCode() {
        return Objects.hash(street, area, pincode, flatNumber);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", area='" + area + '\'' +
                ", pincode='" + pincode + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                '}';
    }
}