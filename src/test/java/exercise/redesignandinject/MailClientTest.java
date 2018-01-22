package exercise.redesignandinject;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class MailClientTest {

    @Test
    public void shouldSendEmail() {
        EmailServer emailServer = mock(EmailServer.class);

        String address = "address@mail.ru";
        String title = "Test Title";
        String body = "Test Body";
        Email expectedEmail = new Email(address, title, body);

        MailClient sut = new MailClient(emailServer);
        sut.sendEmail(address, title, body);

        verify(emailServer).sendEmail(expectedEmail);
    }
}
