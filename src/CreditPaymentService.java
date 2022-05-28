public class CreditPaymentService {
    public double calculate(double loanAmount /*сумма займа*/, double creditPeriodMonth/* срок кредита месс.*/) {

        double precent = 9.99;
        double intersetRate = (precent / (100 * 12));
        double montlyPayment = loanAmount * intersetRate / (1 - (Math.pow((1 + intersetRate), -creditPeriodMonth)));
        return montlyPayment;
    }
}
