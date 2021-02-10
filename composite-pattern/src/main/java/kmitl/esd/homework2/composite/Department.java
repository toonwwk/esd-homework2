package kmitl.esd.homework2.composite;

import java.util.ArrayList;
import java.util.List;

//composite
public class Department implements BusinessUnit {
    private List<BusinessUnit> teamList = new ArrayList<>();

    public Department() {}

    public void addTeam(BusinessUnit d) {
        teamList.add(d);
    }

    @Override
    public void getSlogan() {
        for (BusinessUnit d: teamList) {
            d.getSlogan();
        }
        System.out.println("So our department is the best");
    }
}
