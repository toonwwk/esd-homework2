package kmitl.esd.homework2.singleton.simple;

public class SimpleSingletonTest {
    public static void main(String[] args) {
//        create CompanyManger from constructor is not allow due to protected constructor
//        CompanyManager m1 = CompanyManager();

//        the only way is to use instance
        CompanyManager m1 = CompanyManager.INSTANCE;
        CompanyManager m2 = CompanyManager.INSTANCE;

        m1.setName("Toon");
        m2.setName("Win");

//        the name of managers is Win because CompanyManager is Singleton
        System.out.println(m1.getName());
        System.out.println(m2.getName());
    }
}
