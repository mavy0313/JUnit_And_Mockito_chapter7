package newoperator;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MySutRefactoredTest {

    private MyCollaborator collaborator;

    class MySubclassedRefactoredSut extends MyRefactoredSut {
        @Override
        protected MyCollaborator createCollaborator() {
            return collaborator;
        }
    }

    @Test
    public void testMyMethod() {
        collaborator = mock(MyCollaborator.class);
        MyRefactoredSut sut = new MySubclassedRefactoredSut();
        //when(sut.myMethod()).
    }
}
