public class CalculateTotalAction implements OrderAction {
    private double price;
    private int quantity;

    public CalculateTotalAction(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void execute() {
        double total = price * quantity;
        System.out.println("Order total: $" + total);
    }
}