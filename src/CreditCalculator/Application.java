package CreditCalculator;

import java.util.List;

public class Application implements Credit{

    private List<Credit> credits;

    public Application(List<Credit> credits) {
        this.credits = credits;
    }
    @Override
    public void calculate(int year, double amount, Customer customer) {
        if (credits.isEmpty()){
            System.out.println("En az bir kredi seçmelisiniz.");
        }
        else {
            for (Credit credit : credits){
                credit.calculate(year,amount,customer);
                System.out.println("Kredi verildi: " + customer.getName());
                System.out.println("------------------");
            }

        }
    }
}
