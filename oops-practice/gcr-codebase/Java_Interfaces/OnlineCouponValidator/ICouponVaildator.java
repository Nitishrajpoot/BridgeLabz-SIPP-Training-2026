package OnlineCouponValidator;

interface ICouponVaildator {

    void validateCoupon(String code);

    static boolean isLengthVaild(String code) {
        return code.length() >= 5 && code.length() <= 10;
    }
}

