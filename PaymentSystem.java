interface Payment{
    void pay(int amount);
}

class CreditCardPayment implements Payment{
    public void pay(int amount){
        System.out.println("Paid " + amount + " using Credit Card");
    }
} 

class UPIPayment implements Payment{
    public void pay(int amount){
        System.out.println("Paid " + amount + " using UPI");
    }
}

class PayPalPayment implements Payment{
    public void pay(int amount){
        System.out.println("Paid " + amount + " using PayPal");
    }
}

class ShoppingCart{
    protected Payment payment;
    public void setPaymentMethod(Payment payment){
        this.payment = payment;
    }
    void checkout(int amount){
        payment.pay(amount);
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentMethod(new CreditCardPayment());
        cart.checkout(1000);

        cart.setPaymentMethod(new UPIPayment());
        cart.checkout(500);

        cart.setPaymentMethod(new PayPalPayment());
        cart.checkout(200);
    }
}
