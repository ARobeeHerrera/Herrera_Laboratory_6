public class PlaceOrderAction implements OrderAction {
    private String customerName;
    private String address;

    public PlaceOrderAction(String customerName, String address) {
        this.customerName = customerName;
        this.address = address;
    }

    @Override
    public void execute() {
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}
