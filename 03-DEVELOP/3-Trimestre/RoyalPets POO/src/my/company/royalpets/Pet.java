package my.company.royalpets;

import java.time.LocalDate;

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

    public Pet() {
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
    }
}
