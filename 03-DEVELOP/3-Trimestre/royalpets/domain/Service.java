package my.company.royalpets.domain;

import java.util.HashSet;
import java.util.Set;

public class Service {

    private int idService;
    private String serviceName;
    private String description;
    private double price;
    private boolean status;

    
    private Set<PetService> petServices;

    public Service() {
        this.petServices = new HashSet<>();
    }

    public Service(int idService, String serviceName, String description,
                   double price, boolean status) {

        this.idService = idService;
        this.serviceName = serviceName;
        this.description = description;
        this.price = price;
        this.status = status;
        this.petServices = new HashSet<>();
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Set<PetService> getPetServices() {
        return petServices;
    }

    public void setPetServices(Set<PetService> petServices) {
        this.petServices = petServices;
    }
}