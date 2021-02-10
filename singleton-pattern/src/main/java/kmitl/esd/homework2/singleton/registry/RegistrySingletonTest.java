package kmitl.esd.homework2.singleton.registry;

public class RegistrySingletonTest {

    public static void main(String[] args) {

        Registry r = Registry.INSTANCE;
        CompanyManager manager1 = CompanyManager.INSTANCE;
        CompanyManager manager2 = CompanyManager.INSTANCE;

        Employee e1 = new Employee();
        e1.setFirstName("Toon");
        e1.setSurname("Wong");

        Employee e2 = new Employee();
        e2.setFirstName("SuperToon");
        e2.setSurname("Wong");

        System.out.println("adding Toon on Position manager1");
        r.addEmployee(manager1, e1);
        System.out.println("get name from manager1");
        r.getNameOf(manager1);
        System.out.println("adding SuperToon on Position manager2");
        r.addEmployee(manager2, e2);
        System.out.println("get name from manager1");
        r.getNameOf(manager1);
        System.out.println("Manager's name changes because manager1 and manager2 are really instance of CompanyManager class");
    }
}
