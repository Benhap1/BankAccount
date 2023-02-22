package practice;
import java.time.LocalDate;
import java.util.Calendar;
public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;

    public void put(double amountToPut) {
        lastIncome = LocalDate.now();
        super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        LocalDate oneMonthAgo = LocalDate.now().minusMonths(1);
        if (lastIncome != null && lastIncome.isAfter(oneMonthAgo)) {
            System.out.println("You cannot withdraw money within one month after the last deposit.");
        } else {
            super.take(amountToTake);
        }
    }
}
