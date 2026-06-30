package my.company.royalpets;


import java.time.LocalDateTime;

public class ServiceAppointment {

    private int idServiceAppointment;
    private PetService petService;
    private LocalDateTime appointmentDate;
    private String status;

    public ServiceAppointment() {
    }

    public ServiceAppointment(int idServiceAppointment,
                              PetService petService,
                              LocalDateTime appointmentDate,
                              String status) {

        this.idServiceAppointment = idServiceAppointment;
        this.petService = petService;
        this.appointmentDate = appointmentDate;
        this.status = status;
    }

    public int getIdServiceAppointment() {
        return idServiceAppointment;
    }

    public void setIdServiceAppointment(int idServiceAppointment) {
        this.idServiceAppointment = idServiceAppointment;
    }

    public PetService getPetService() {
        return petService;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public String getStatus() {
        return status;
    }
}
