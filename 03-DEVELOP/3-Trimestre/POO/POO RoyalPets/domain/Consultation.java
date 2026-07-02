package my.company.royalpets.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Consultation {

    private int idConsultation;
    private MedicalAppointment appointment;
    private Veterinarian veterinarian;
    private LocalDate consultationDate;
    private String diagnosis;

    // Relación 1:N con Treatment
    private Set<Treatment> treatments;

    // Relación 1:N con MedicalRecordConsultation
    private Set<MedicalRecordConsultation> medicalRecordConsultations;

    public Consultation() {
        this.treatments = new HashSet<>();
        this.medicalRecordConsultations = new HashSet<>();
    }

    public Consultation(int idConsultation,
                        MedicalAppointment appointment,
                        Veterinarian veterinarian,
                        LocalDate consultationDate,
                        String diagnosis) {

        this.idConsultation = idConsultation;
        this.appointment = appointment;
        this.veterinarian = veterinarian;
        this.consultationDate = consultationDate;
        this.diagnosis = diagnosis;

        this.treatments = new HashSet<>();
        this.medicalRecordConsultations = new HashSet<>();
    }

    public int getIdConsultation() {
        return idConsultation;
    }

    public void setIdConsultation(int idConsultation) {
        this.idConsultation = idConsultation;
    }

    public MedicalAppointment getAppointment() {
        return appointment;
    }

    public void setAppointment(MedicalAppointment appointment) {
        this.appointment = appointment;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    public LocalDate getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(LocalDate consultationDate) {
        this.consultationDate = consultationDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Set<Treatment> getTreatments() {
        return treatments;
    }

    public void setTreatments(Set<Treatment> treatments) {
        this.treatments = treatments;
    }

    public Set<MedicalRecordConsultation> getMedicalRecordConsultations() {
        return medicalRecordConsultations;
    }

    public void setMedicalRecordConsultations(Set<MedicalRecordConsultation> medicalRecordConsultations) {
        this.medicalRecordConsultations = medicalRecordConsultations;
    }
}