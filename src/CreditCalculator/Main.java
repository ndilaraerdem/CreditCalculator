package CreditCalculator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(1, "dilara");
        List<Credit> credits = new ArrayList<>();
        credits.add(new NeedCredit());
        credits.add(new CarCredit());
        Application application = new Application(credits);
        application.calculate(1, 20000, customer);

    }
}
