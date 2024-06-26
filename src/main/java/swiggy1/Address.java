package swiggy1;

public class Address {

    public String area;

    public String roadNumber;

    public String FlatNumber;



    public boolean equals (Object obj ){
        if (this == obj) {
            return true;
        }

        if (getClass()!= obj.getClass()) {
            return false;
        }

     Address address = (Address) obj;
     return this.area.equals(address.area)&&
             this.FlatNumber.equals(address.FlatNumber)&&
             this.roadNumber.equals(address.roadNumber);

        }

    @Override
        public int hashCode() {
        return this.area.hashCode()+ this.roadNumber.hashCode();
    }
}
