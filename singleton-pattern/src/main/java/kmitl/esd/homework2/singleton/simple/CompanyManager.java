package kmitl.esd.homework2.singleton.simple;

public class CompanyManager {

    public static final CompanyManager INSTANCE = new CompanyManager();
    private String name;

    // use protected constructor approach for singleton pattern
    protected CompanyManager() {}

    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }

}