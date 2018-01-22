package newoperator;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class MySutRedesignedTest {

    @Test
    public void testMyMethod() throws Exception {
        MyCollaborator collaborator = mock(MyCollaborator.class);
        MySutRedesigned sut = new MySutRedesigned(collaborator);

        sut.myMethod();


        // normal test using Mockito's syntax
        // e.g. Mockito.when(collaborator.someMethod()).thenReturn(...)
    }
}
