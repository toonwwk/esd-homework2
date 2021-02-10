package kmitl.esd.homework2.model;

public class ForeignCompany extends Company{

    public CompanyType getCompanyType() {
        return CompanyType.FOREIGN;
    }

    public String getName() {
        return "Foreign Comp." + name;
    }
}
