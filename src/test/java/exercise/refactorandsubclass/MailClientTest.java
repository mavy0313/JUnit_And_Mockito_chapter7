package exercise.refactorandsubclass;


import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MailClientTest {

    private EmailServer emailServer = mock(EmailServer.class);

    class MailClientSubclassed extends MailClient {

        @Override
        protected EmailServer createEmailServer() {
            return emailServer;
        }
    }

    @Test
    public void shouldSendEmail() {
        MailClient sut = new MailClientSubclassed();

        String address = "address@mail.ru";
        String title = "Test Title";
        String body = "Test Body";
        Email expectedEmail = new Email(address, title, body);

        sut.sendEmail(address, title, body);

        verify(emailServer).sendEmail(expectedEmail);
    }
}
