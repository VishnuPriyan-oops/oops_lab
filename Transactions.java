interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class PaymentService {
    void processPayment(Payment p, double amount) {
        p.pay(amount);
    }
}

public class Transactions {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        Payment p1 = new CreditCard();
        Payment p2 = new UPI();

        service.processPayment(p1, 1000);
        service.processPayment(p2, 500);
    }
}