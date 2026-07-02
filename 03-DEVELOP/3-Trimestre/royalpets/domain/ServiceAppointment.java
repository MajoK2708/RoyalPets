package my.company.royalpets.domain;


import java.time.LocalDateTime;

public class ServiceAppointment {

    private int idServiceAppointment;
    private PetService petService;
    private Employee employee;
    private LocalDateTime appointmentDate;
    private String observations;
    private String status;

    public ServiceAppointment() {
    }

    public ServiceAppointment(int idServiceAppointment,
                              PetService petService,
                              Employee employee,
                              LocalDateTime appointmentDate,
                              String observations,
                              String status) {

        this.idServiceAppointment = idServiceAppointment;
        this.petService = petService;
        this.employee = employee;
        this.appointmentDate = appointmentDate;
        this.observations = observations;
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

    public void setPetService(PetService petService) {
        this.petService = petService;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
