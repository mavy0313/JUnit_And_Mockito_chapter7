package exercise.refactorandsubclass;

public class MailClient {

    public void sendEmail(String address, String title, String body) {
        Email email = new Email(address, title, body);
        EmailServer emailServer = createEmailServer();
        emailServer.sendEmail(email);
    }

    // method extracted to facilitate testing
    protected EmailServer createEmailServer() {
        return new EmailServer();
    }
}
