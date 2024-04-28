public class SendEmailNotificationAction implements OrderAction {
    private String email;

    public SendEmailNotificationAction(String email) {
        this.email = email;
    }

    @Override
    public void execute() {
        System.out.println("Email notification sent to: " + email);
    }
}