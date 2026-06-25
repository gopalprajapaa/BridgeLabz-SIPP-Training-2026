interface CouponValidator {

    // Abstract method
    boolean validateCoupon(String code);

    // Static method
    static boolean isLengthValid(String code) {
        return code.length() >= 5 && code.length() <= 10;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {

        // Check length using static method
        if (!CouponValidator.isLengthValid(code)) {
            return false;
        }

        // Coupon should start with "DISC"
        if (!code.startsWith("DISC")) {
            return false;
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {

        String[] coupons = {
            "DISC10",
            "SAVE20",
            "DISC50",
            "AB",
            "DISC1000"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {

            if (cart.validateCoupon(coupon)) {
                System.out.println(coupon + " -> Valid Coupon");
            } else {
                System.out.println(coupon + " -> Invalid Coupon");
            }
        }
    }
}