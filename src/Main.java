public class Main {
    public static void main(String[] args) {
        CreditPaymentService credit = new CreditPaymentService();
        double montlyPayment = credit.calculate(1_000_000, 12);
        System.out.printf("%.0f", montlyPayment);
        System.out.println();
        System.out.printf("%.0f", credit.calculate(1_000_000, 24));
        System.out.println();
        System.out.printf("%.0f", credit.calculate(1_000_000, 36));


    }
}

