package my.company.royalpets;

public class Service {

    private int idService;
    private String serviceName;
    private String description;
    private double price;

    public Service() {
    }

    public Service(int idService,
                   String serviceName,
                   String description,
                   double price) {

        this.idService = idService;
        this.serviceName = serviceName;
        this.description = description;
        this.price = price;
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

    public double getPrice() {
        return price;
    }
}
