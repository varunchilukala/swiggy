package ajio;

import java.util.List;

public class Shop {

public List<Product> productList;


public Product findproduct(String type, String colour , String size) {

  for (int i = 0; i < productList.size(); ) {
    Product product = productList.get(i);
    if (product.type.equals(type) && product.productspecification.colour.equals(colour) && product.productspecification.size.equals(size)) ;
    return product;
  }
    return null;

    }
  }

