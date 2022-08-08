package behavioural.strategy.payment_merchants;

public class Razorpay implements Merchent {

    @Override
    public void pay() {
        System.out.println(Razorpay.class);
    }
}
