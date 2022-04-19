package structural.adapter;

public class BankCustomer extends BankDetails implements CreditCard {

    @Override
    public void giveBankDetails() {
        this.setBankName("HDFC");
        this.setAccountNumber(123456789);
        this.setAccountHolderName("John Doe");
    }

    @Override
    public String getCreditCardDetails() {
        return String.format("Bank Name : %s, Account Number : %s of Holder Name : %s is Eligible for a Credit Card.", this.getBankName(), this.getAccountNumber(), this.getAccountHolderName());
    }
}
