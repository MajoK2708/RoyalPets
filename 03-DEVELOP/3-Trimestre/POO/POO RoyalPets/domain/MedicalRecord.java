package my.company.royalpets.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class MedicalRecord {

    private int idMedicalRecord;
    private MedicalAppointment appointment;
    private LocalDate creationDate;
    private String observations;

    
    private Set<MedicalRecordConsultation> medicalRecordConsultations;

    public MedicalRecord() {
        this.medicalRecordConsultations = new HashSet<>();
    }

    public MedicalRecord(int idMedicalRecord,
                         MedicalAppointment appointment,
                         LocalDate creationDate,
                         String observations) {

        this.idMedicalRecord = idMedicalRecord;
        this.appointment = appointment;
        this.creationDate = creationDate;
        this.observations = observations;
        this.medicalRecordConsultations = new HashSet<>();
    }

    public int getIdMedicalRecord() {
        return idMedicalRecord;
    }

    public void setIdMedicalRecord(int idMedicalRecord) {
        this.idMedicalRecord = idMedicalRecord;
    }

    public MedicalAppointment getAppointment() {
    return appointment;
    }

    public void setAppointment(MedicalAppointment appointment) {
    this.appointment = appointment;
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

    public Set<MedicalRecordConsultation> getMedicalRecordConsultations() {
        return medicalRecordConsultations;
    }

    public void setMedicalRecordConsultations(Set<MedicalRecordConsultation> medicalRecordConsultations) {
        this.medicalRecordConsultations = medicalRecordConsultations;
    }
}