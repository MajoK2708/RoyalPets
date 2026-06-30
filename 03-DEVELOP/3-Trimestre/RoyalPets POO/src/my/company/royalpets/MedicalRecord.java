package my.company.royalpets;

import java.time.LocalDate;

public class MedicalRecord {

    private int idMedicalRecord;
    private Pet pet;
    private LocalDate creationDate;
    private String observations;

    public MedicalRecord() {
    }

    public MedicalRecord(int idMedicalRecord,
                         Pet pet,
                         LocalDate creationDate,
                         String observations) {

        this.idMedicalRecord = idMedicalRecord;
        this.pet = pet;
        this.creationDate = creationDate;
        this.observations = observations;
    }

    public int getIdMedicalRecord() {
        return idMedicalRecord;
    }

    public void setIdMedicalRecord(int idMedicalRecord) {
        this.idMedicalRecord = idMedicalRecord;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
