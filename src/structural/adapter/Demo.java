/*
Also known as Wrapper.
Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
 */

package structural.adapter;

public class Demo {
    public static void main(String[] args) {
        BankCustomer bankCustomer = new BankCustomer();
        bankCustomer.giveBankDetails();
        System.out.println(bankCustomer.getCreditCardDetails());
    }
}
