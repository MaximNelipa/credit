public class CreditPaymentService {
    public int calculate(int period, int amount, double rate) {
        double monthPercent = rate / 100 / 12;
        double coefficient = monthPercent + (monthPercent / (Math.pow(monthPercent + 1, period) - 1));
        double payment = coefficient * amount;
        return (int) payment;
    }
}
