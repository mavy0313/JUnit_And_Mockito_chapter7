package newoperator;

import org.junit.Test;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

public class MySutPartialTest {

    @Test
    public void testMyMethod() {
        MyPartialSut sut = spy(new MyPartialSut());
        MyCollaborator collaborator = mock(MyCollaborator.class);
        doReturn(collaborator).when(sut).createCollaborator();
        // normal Mockito stubbing/test spying test
    }
}
