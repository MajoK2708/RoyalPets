package my.company.royalpets;

import java.time.LocalDate;

public class Consultation {

    private int idConsultation;
    private MedicalAppointment appointment;
    private Veterinarian veterinarian;
    private LocalDate consultationDate;
    private String diagnosis;

    public Consultation() {
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
}
