package behavioural.strategy.payment_merchants;

public class Justpay implements Merchent {
    @Override
    public void pay() {
        System.out.println(Justpay.class);
    }
}
