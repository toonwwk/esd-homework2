package kmitl.esd.homework2.singleton.registry;

public class CompanyManager extends Position {

    public static final CompanyManager INSTANCE = new CompanyManager();

    protected CompanyManager() { salary = 100000; }

}


