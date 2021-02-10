package kmitl.esd.homework2.composite;

//Leaf
public class IOSTeam implements BusinessUnit {

    IOSTeam() {}

    @Override
    public void getSlogan() {
        System.out.println("iOS team is the best");
    }
}
