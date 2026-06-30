package my.company.royalpets;

public class Employee {

    private int idEmployees;
    private Profile profile;
    private String employeeCode;
    private String position;
    private boolean status;

    public Employee() {
    }

    public Employee(int idEmployees, Profile profile,
                    String employeeCode, String position,
                    boolean status) {

        this.idEmployees = idEmployees;
        this.profile = profile;
        this.employeeCode = employeeCode;
        this.position = position;
        this.status = status;
    }
}
