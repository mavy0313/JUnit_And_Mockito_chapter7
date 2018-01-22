package exercise.partialmocking;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class MailClientTest {

    @Test
    public void shouldSendEmail() {
        MailClient sut = spy(new MailClient());
        EmailServer emailServer = mock(EmailServer.class);

        String address = "address@mail.ru";
        String title = "Test Title";
        String body = "Test Body";
        Email expectedEmail = new Email(address, title, body);

        doReturn(emailServer).when(sut).createEmailServer();

        sut.sendEmail(address, title, body);

        verify(emailServer).sendEmail(expectedEmail);
    }
}
