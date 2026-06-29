package Inheritance;

class Order {

    String orderId;
    String orderDate;

    Order(String orderId,
          String orderDate) {

        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }

    public void displayInfo() {

        System.out.println(
                "Order ID : " + orderId);

        System.out.println(
                "Order Date : " + orderDate);

        System.out.println(
                "Status : " +
                        getOrderStatus());
    }
}


class ShippedOrder extends Order {

    String trackingNumber;

    ShippedOrder(String orderId,
                 String orderDate,
                 String trackingNumber) {

        super(orderId, orderDate);

        this.trackingNumber =
                trackingNumber;
    }

    @Override
    public String getOrderStatus() {

        return "Order Shipped";
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println(
                "Tracking Number : " +
                        trackingNumber);
    }
}


class DeliveredOrder
        extends ShippedOrder {

    String deliveryDate;

    DeliveredOrder(String orderId,
                   String orderDate,
                   String trackingNumber,
                   String deliveryDate) {

        super(orderId,
                orderDate,
                trackingNumber);

        this.deliveryDate =
                deliveryDate;
    }

    @Override
    public String getOrderStatus() {

        return "Order Delivered";
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println(
                "Delivery Date : " +
                        deliveryDate);
    }
}


public class OnlineRetailOrderManagement {

    public static void main(
            String[] args) {

        DeliveredOrder order =
                new DeliveredOrder(
                        "ORD101",
                        "29-06-2026",
                        "TRK99887",
                        "02-07-2026"
                );

        System.out.println(
                "Order Details:\n");

        order.displayInfo();


        System.out.println(
                "\nCurrent Status : " +
                        order.getOrderStatus());
    }
}