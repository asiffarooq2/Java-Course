public class CashRegister {
    private double purchase;
    private double payment;

    // Constructor
    public CashRegister() {
        purchase = 0;
        payment = 0;
    }

    // Record a purchase
    public void recordPurchase(double amount) {
        purchase += amount;
    }

    // Receive payment
    public void receivePayment(double amount) {
        payment += amount;
    }

    // Calculate and return change
    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}

class CashRegisterTest {
    public static void main(String[] args) {

        // Create CashRegister object
        CashRegister register = new CashRegister();

        // Record purchases
        register.recordPurchase(25.50);
        register.recordPurchase(14.75);

        // Receive payment
        register.receivePayment(50.00);

        // Display change
        System.out.println("Change: $" + register.giveChange());
    }
}