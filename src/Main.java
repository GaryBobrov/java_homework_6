public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        int term = 3;
        int CPS = service.calculate(sum, term); // должно получиться 500
        System.out.println(CPS);
    }
}