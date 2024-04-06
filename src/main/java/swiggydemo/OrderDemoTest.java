package swiggydemo;

public class OrderDemoTest {
    public static void main(String[] args) {

        Address address =new Address();
        address.housenumber="3050";
        address.pincode="508213";
        address.street="sri ram nagar";

        Product product =new Product();
        product.productname ="chicken";
        product.price=250;


        Orderitems orderitems = new Orderitems();
        orderitems.price =250;
        orderitems.quntity=1;
        orderitems.product=product;

        Order order =new Order();
        order.orderId="185466";
        order.orderitem=orderitems;
        order.price=250;
        order.address=address;

        System.out.println(order.orderitem.product.productname);




    }
}
