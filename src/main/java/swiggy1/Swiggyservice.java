package swiggy1;

import java.util.ArrayList;
import java.util.List;

public class Swiggyservice {
  List<Resturant> resturantList;

    public List<Resturant> getresturant( ){
        Resturant resturant1=new Resturant();

        Address address =new Address();
        address.area="kkroad";
        address.roadNumber="5";
        address.FlatNumber="505";

        Dish dish =new Dish();
        dish.dishName="chicken biriyani";
        dish.dishPrice=250;
        dish.type="non veg";

        Dish dish1 =new Dish();
        dish1.dishName="chicken65";
        dish1.dishPrice=230;


        List<Dish>dishList =new ArrayList<>();
        dishList.add(dish);
        dishList.add(dish1);

        resturant1.dishList=dishList;



        resturant1.resturantName="balajigrand";
        resturant1.rating=4.5;
        resturant1.address=address;


        Resturant resturant2=new Resturant();


      Address address2 =new Address();
      address2.area="mgroad";
      address2.roadNumber="6";
      address2.FlatNumber="404";



        resturant2.resturantName="kfc";
        resturant2.rating=4.6;
        resturant2.address=address;

        Dish dish2 =new Dish();
        dish2.dishName="friedchicken";
        dish2.dishPrice=110;

        Dish dish3 =new Dish();
        dish3.dishName="coke";
        dish3.dishPrice=50;

        List<Dish>dishList1 =new ArrayList<>();
        dishList1.add(dish2);
        dishList1.add(dish3);

        resturant2.dishList=dishList1;

        Resturant resturant3=new Resturant();
        Address address3 =new Address();
        address3.area="gandhiroad";
        address3.roadNumber="9";
        address3.FlatNumber="565";

        resturant3.resturantName="mcdonald's";
        resturant3.rating=4.3;
        resturant3.address=address;


        Dish dish4 =new Dish();
        dish4.dishName="burger";
        dish4.dishPrice=150;


        Dish dish5 = new Dish();
        dish5.dishName="dietcoke";
        dish5.dishPrice=100;

        List<Dish>dishList2 =new ArrayList<>();
        dishList2.add(dish4);
        dishList2.add(dish5);

        resturant3.dishList=dishList2;

      List<Resturant> resturantList1 =new ArrayList<>();
      resturantList1.add(resturant1);
      resturantList1.add(resturant2);
      resturantList1.add(resturant3);

      return resturantList;

    }

}
