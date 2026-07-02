package my.company.royalpets.domain;



import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Client {

    private int idClients;
    private Profile profile;
    private LocalDate registrationDate;
    private boolean status;

    
    private Set<Pet> pets;

    public Client() {
        this.pets = new HashSet<>();
    }

    public Client(int idClients, Profile profile,
                  LocalDate registrationDate, boolean status) {

        this.idClients = idClients;
        this.profile = profile;
        this.registrationDate = registrationDate;
        this.status = status;
        this.pets = new HashSet<>();
    }

    public int getIdClients() {
        return idClients;
    }

    public void setIdClients(int idClients) {
        this.idClients = idClients;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
