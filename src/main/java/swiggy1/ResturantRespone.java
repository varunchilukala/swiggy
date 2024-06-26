package swiggy1;

import java.util.List;

public class ResturantRespone {

 public Resturant selectResturant(Swiggyservice swiggyservice, String resturantName){

for ( Resturant resturant:swiggyservice.resturantList){
 if (resturant.resturantName.equals(resturantName)){

  return resturant;
 }
}
return null;
 }
public Dish selectdish(Resturant resturant, String dishname){

  for (Dish dish: resturant.dishList){
   if (dish.dishName.equals(dishname)){

    return dish;
   }
  }
  return null;
}



}
