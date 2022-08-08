package behavioural.strategy.factories;

import behavioural.strategy.constants.MerchentEnum;
import behavioural.strategy.payment_merchants.Justpay;
import behavioural.strategy.payment_merchants.Merchent;
import behavioural.strategy.payment_merchants.Razorpay;

public class Factory {
    public static final Merchent getMerchant(MerchentEnum merchentEnum) {
        switch (merchentEnum) {
            case JUSTPAY:
                return new Justpay();
            case RAZORPAY:
                return new Razorpay();
            default:
                return null;
        }
    }
}
