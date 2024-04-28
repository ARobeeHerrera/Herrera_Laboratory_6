public class GenerateInvoiceAction implements OrderAction {
    private String fileName;

    public GenerateInvoiceAction(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        // Simulate generating invoice file
        System.out.println("Invoice generated: " + fileName);
    }
}