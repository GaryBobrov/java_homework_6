public class CreditPaymentService {

    public int calculate(int sum, int term) {
        int sums = sum;
        int terms = term * 12;
        double bet = 0.0999 / 12;
        double monthlypayment = ((bet + (bet / (Math.pow(1 + bet, terms) - 1))) * sums);
        return (int) monthlypayment;
    }
}
