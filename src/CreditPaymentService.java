public class CreditPaymentService {
    public double calculate(int creditAmount, double monthPercent, int month) {
        double x = 1 + monthPercent;
        double y = Math.pow(x, month);
        double monthPayment = creditAmount * ((monthPercent * y) / (y - 1));
        return monthPayment;
    }
}
