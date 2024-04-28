public class OrderTest {
    public static void main(String[] args) {
        OrderAction calculateTotalAction = new CalculateTotalAction(10.0, 2);
        OrderAction placeOrderAction = new PlaceOrderAction("John Doe", "123 Main St");

        calculateTotalAction.execute();
        placeOrderAction.execute();

        OrderAction generateInvoiceAction = new GenerateInvoiceAction("order_123.pdf");
        OrderAction sendEmailNotificationAction = new SendEmailNotificationAction("johndoe@example.com");

        generateInvoiceAction.execute();
        sendEmailNotificationAction.execute();
    }
}