package ajio;

import java.util.ArrayList;
import java.util.List;

public class Shopdemo {
    public static void main(String[] args) {

        Product shirtproduct = new Product();
        Productspecification productspecification =new Productspecification();
        productspecification.size="38";
        productspecification.colour="black";
        productspecification.price=2500;



        Product jeansproduct =new Product();
        Productspecification jeansproductspecification =new Productspecification();
        jeansproductspecification.size="28";
        jeansproductspecification.colour="blue";
        jeansproductspecification.price=3800;



        Product shoeproduct =new Product();
        Productspecification shoeproductspecification = new Productspecification();
        shoeproductspecification.size="7";
        shoeproductspecification.colour="white";
        shoeproductspecification.price=2000;


        Shop shop = new Shop();
        List<Product> productList =new ArrayList<>();
        productList.add(shirtproduct);
        productList.add(jeansproduct);
        productList.add(shoeproduct);

Product foundproduct = shop.findproduct("shirt","black","38");
if (foundproduct !=null){
    System.out.println("matching product found:"+ foundproduct.type + "size" + foundproduct.productspecification.size + "colour" + foundproduct.productspecification.colour);
}else{
    System.out.println("match not found");
}



    }

}
