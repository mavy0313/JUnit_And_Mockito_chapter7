package exercise;

import org.junit.Test;

public class MailClientTest {

    @Test
    public void shouldSendEmail() {
        MailClient sut = new MailClient();

        String address = "address@mail.ru";
        String title = "Test Title";
        String body = "Test Body";

        sut.sendEmail(address, title, body);
    }
}
