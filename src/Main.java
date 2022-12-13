public class Main {
    public static void main(String[] args) {

        //int creditAmount = 1_000_000;    //сумма кредита
        //double monthPercent = 9.99;      //процентная ставка
        //int month = 12;                  //количество месяцев на которые взят кредит
        CreditPaymentService service = new CreditPaymentService();

        double monthPayment = service.calculate(1_000_000, 9.99, 12);
        System.out.println("Кредит на 1 год, ежемесячный платёж: " + monthPayment);

        System.out.println();
        monthPayment = service.calculate(1_000_000, 9.99, 24);
        System.out.println("Кредит на 2 года, ежемесячный платёж: " + monthPayment);

        System.out.println();
        monthPayment = service.calculate(1_000_000, 9.99, 36);
        System.out.println("Кредит на 3 года, ежемесячный платёж: " + monthPayment);

    }
}