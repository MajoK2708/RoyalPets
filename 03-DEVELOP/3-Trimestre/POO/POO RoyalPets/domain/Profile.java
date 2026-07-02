package my.company.royalpets.domain;

import java.util.HashSet;
import java.util.Set;

public class Profile {

    private int idProfile;
    private User user;
    private DocumentType documentType;
    private String phone;
    private String firstName;
    private String secondName;
    private String firstLastName;
    private String secondLastName;
    private String documentNumber;

    
    private Set<Client> clients;
    private Set<Employee> employees;
    private Set<Veterinarian> veterinarians;

    public Profile() {
        this.clients = new HashSet<>();
        this.employees = new HashSet<>();
        this.veterinarians = new HashSet<>();
    }

    public Profile(int idProfile, User user, DocumentType documentType,
                   String phone, String firstName, String secondName,
                   String firstLastName, String secondLastName,
                   String documentNumber) {

        this.idProfile = idProfile;
        this.user = user;
        this.documentType = documentType;
        this.phone = phone;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.documentNumber = documentNumber;

        this.clients = new HashSet<>();
        this.employees = new HashSet<>();
        this.veterinarians = new HashSet<>();
    }

    public int getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(int idProfile) {
        this.idProfile = idProfile;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Veterinarian> getVeterinarians() {
        return veterinarians;
    }

    public void setVeterinarians(Set<Veterinarian> veterinarians) {
        this.veterinarians = veterinarians;
    }
}
