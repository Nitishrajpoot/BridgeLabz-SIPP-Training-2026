package OnlineCouponValidator;

class ShoppingCart implements ICouponVaildator {

    @Override
    public void validateCoupon(String code) {

        boolean valid =
                ICouponVaildator.isLengthVaild(code)
                        && code.toUpperCase().startsWith("SAVE");

        if (valid) {
            System.out.println(code + " -> Valid Coupon");
        } else {
            System.out.println(code + " -> Invalid Coupon");
        }
    }
}
