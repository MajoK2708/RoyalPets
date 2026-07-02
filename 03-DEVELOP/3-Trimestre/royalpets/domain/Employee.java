package my.company.royalpets.domain;

import java.util.HashSet;
import java.util.Set;

public class Employee {

    private int idEmployees;
    private Profile profile;
    private String employeeCode;
    private String position;
    private boolean status;

    
    private Set<PetService> petServices;

    
    private Set<ServiceAppointment> serviceAppointments;

    public Employee() {
        this.petServices = new HashSet<>();
        this.serviceAppointments = new HashSet<>();
    }

    public Employee(int idEmployees, Profile profile,
                    String employeeCode, String position,
                    boolean status) {

        this.idEmployees = idEmployees;
        this.profile = profile;
        this.employeeCode = employeeCode;
        this.position = position;
        this.status = status;

        this.petServices = new HashSet<>();
        this.serviceAppointments = new HashSet<>();
    }

    public int getIdEmployees() {
        return idEmployees;
    }

    public void setIdEmployees(int idEmployees) {
        this.idEmployees = idEmployees;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Set<PetService> getPetServices() {
        return petServices;
    }

    public void setPetServices(Set<PetService> petServices) {
        this.petServices = petServices;
    }

    public Set<ServiceAppointment> getServiceAppointments() {
        return serviceAppointments;
    }

    public void setServiceAppointments(Set<ServiceAppointment> serviceAppointments) {
        this.serviceAppointments = serviceAppointments;
    }
}
