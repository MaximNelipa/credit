public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int period = 36;
        int amount = 1_000_000;
        double rate = 9.99;
        int payment = service.calculate(period, amount, rate);
        System.out.println(payment);
    }
}