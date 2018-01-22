package exercise.powermock;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@PrepareForTest(EmailServer.class)
@RunWith(PowerMockRunner.class)
public class MailClientTest {

    @Test
    public void shouldSendEmail() {
        MailClient sut = new MailClient();
        PowerMockito.mockStatic(EmailServer.class);

        String address = "address@mail.ru";
        String title = "Test Title";
        String body = "Test Body";
        Email expectedEmail = new Email(address, title, body);

        sut.sendEmail(address, title, body);

        PowerMockito.verifyStatic();
        EmailServer.sendEmail(expectedEmail);
    }
}
