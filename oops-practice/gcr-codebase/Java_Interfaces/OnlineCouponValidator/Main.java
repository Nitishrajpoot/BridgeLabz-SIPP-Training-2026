package OnlineCouponValidator;

public class Main {

    public static void main(String[] args) {

        String coupons[] = {

                "Save123",

                "Hi1 123",
                "HSA@%A",
                "SAVE6789",
                "tuigv112334"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String code : coupons) {
            cart.validateCoupon(code);
        }
    }
}