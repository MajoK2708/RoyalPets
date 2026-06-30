package my.company.royalpets;

import java.time.LocalDate;

public class PetService {

    private int idPetService;
    private Pet pet;
    private Service service;
    private Employee employee;
    private LocalDate serviceDate;

    public PetService() {
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

    public Service getService() {
        return service;
    }

    public Employee getEmployee() {
        return employee;
    }

    public LocalDate getServiceDate() {
        return serviceDate;
    }
}
