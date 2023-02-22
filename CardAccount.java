package practice;

public class CardAccount extends BankAccount {
    private static final double COMMISSION_RATE = 0.01;
    @Override
    public void take(double amountToTake){
        double commission = amountToTake * COMMISSION_RATE;
        super.take(amountToTake + commission);
    }
    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);
}
