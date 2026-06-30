package my.company.royalpets;

import java.time.LocalDateTime;

public class MedicalAppointment {

    private int idAppointment;
    private Pet pet;
    private Veterinarian veterinarian;
    private LocalDateTime appointmentDate;
    private String reason;
    private String status;

    public MedicalAppointment() {
    }

    public MedicalAppointment(int idAppointment, Pet pet,
                              Veterinarian veterinarian,
                              LocalDateTime appointmentDate,
                              String reason,
                              String status) {

        this.idAppointment = idAppointment;
        this.pet = pet;
        this.veterinarian = veterinarian;
        this.appointmentDate = appointmentDate;
        this.reason = reason;
        this.status = status;
    }

    public int getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(int idAppointment) {
        this.idAppointment = idAppointment;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
