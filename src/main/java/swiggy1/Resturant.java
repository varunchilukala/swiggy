package swiggy1;

import java.util.List;

public class Resturant {
    public String resturantName;

    public double rating;

    public Address address;
    public List<Dish> dishList;

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Resturant resturant =(Resturant) obj;
      return this.resturantName.equals(resturantName);



    }

}