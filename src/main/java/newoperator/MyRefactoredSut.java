package newoperator;

public class MyRefactoredSut {

    public void myMethod() {
        MyCollaborator collaborator = createCollaborator();
        // some behaviour worth testing here which uses collaborator
    }

    // method extracted to facilitate testing
    protected MyCollaborator createCollaborator() {
        return new MyCollaborator();
    }


}
