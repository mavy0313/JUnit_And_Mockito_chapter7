package exercise.redesignandinject;

public class MailClient {

    private final EmailServer emailServer;

    public MailClient(EmailServer emailServer) {
        this.emailServer = emailServer;
    }

    public void sendEmail(String address, String title, String body) {
        Email email = new Email(address, title, body);
//        EmailServer.sendEmail(email);
        emailServer.sendEmail(email);
    }
}
