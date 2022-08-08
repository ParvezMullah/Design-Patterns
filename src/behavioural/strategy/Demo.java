package behavioural.strategy;

import behavioural.strategy.constants.MerchentEnum;
import behavioural.strategy.factories.Factory;
import behavioural.strategy.payment_merchants.Merchent;

//lets you define family of algorithms, put each of them into a separate class and make their objects interchangeable.
public class Demo {
    public static void main(String[] args) {
        Merchent merchent = Factory.getMerchant(MerchentEnum.RAZORPAY);
        merchent.pay();

        merchent = Factory.getMerchant(MerchentEnum.JUSTPAY);
        merchent.pay();
    }
}
