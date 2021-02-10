package kmitl.esd.homework2.composite;

//Leaf
public class AndriodTeam implements BusinessUnit {

    AndriodTeam() {}

    @Override
    public void getSlogan() {
        System.out.println("andriod team is the best");
    }
}