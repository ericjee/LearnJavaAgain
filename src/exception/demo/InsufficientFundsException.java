package exception.demo;

/**
 * Created by eric on 4/5/16.
 */
public class InsufficientFundsException extends Exception{
    private double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
