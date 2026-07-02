package my.company.royalpets.domain;



import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class PetService {

    private int idPetService;
    private Pet pet;
    private Service service;
    private Employee employee;
    private LocalDate serviceDate;

    
    private Set<ServiceAppointment> serviceAppointments;

    public PetService() {
        this.serviceAppointments = new HashSet<>();
    }

    public PetService(int idPetService,
                      Pet pet,
                      Service service,
                      Employee employee,
                      LocalDate serviceDate) {

        this.idPetService = idPetService;
        this.pet = pet;
        this.service = service;
        this.employee = employee;
        this.serviceDate = serviceDate;
        this.serviceAppointments = new HashSet<>();
    }

    public int getIdPetService() {
        return idPetService;
    }

    public void setIdPetService(int idPetService) {
        this.idPetService = idPetService;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(LocalDate serviceDate) {
        this.serviceDate = serviceDate;
    }

    public Set<ServiceAppointment> getServiceAppointments() {
        return serviceAppointments;
    }

    public void setServiceAppointments(Set<ServiceAppointment> serviceAppointments) {
        this.serviceAppointments = serviceAppointments;
    }
}