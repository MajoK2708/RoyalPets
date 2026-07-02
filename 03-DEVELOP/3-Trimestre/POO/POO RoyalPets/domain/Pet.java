package my.company.royalpets.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Pet {

    private int idPets;
    private Client client;
    private String petsName;
    private String species;
    private String breed;
    private double weight;
    private String photoUrl;
    private LocalDate birthDate;
    private String gender;

    
    private Set<MedicalAppointment> medicalAppointments;


    private Set<PetService> petServices;

    public Pet() {
        this.medicalAppointments = new HashSet<>();
        this.petServices = new HashSet<>();
    }

    public Pet(int idPets, Client client, String petsName,
               String species, String breed,
               double weight, String photoUrl,
               LocalDate birthDate, String gender) {

        this.idPets = idPets;
        this.client = client;
        this.petsName = petsName;
        this.species = species;
        this.breed = breed;
        this.weight = weight;
        this.photoUrl = photoUrl;
        this.birthDate = birthDate;
        this.gender = gender;

        this.medicalAppointments = new HashSet<>();
        this.petServices = new HashSet<>();
    }

    public int getIdPets() {
        return idPets;
    }

    public void setIdPets(int idPets) {
        this.idPets = idPets;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPetsName() {
        return petsName;
    }

    public void setPetsName(String petsName) {
        this.petsName = petsName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Set<MedicalAppointment> getMedicalAppointments() {
        return medicalAppointments;
    }

    public void setMedicalAppointments(Set<MedicalAppointment> medicalAppointments) {
        this.medicalAppointments = medicalAppointments;
    }

    public Set<PetService> getPetServices() {
        return petServices;
    }

    public void setPetServices(Set<PetService> petServices) {
        this.petServices = petServices;
    }
}
