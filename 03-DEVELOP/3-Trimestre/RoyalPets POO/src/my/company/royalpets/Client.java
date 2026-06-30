package my.company.royalpets;

import java.time.LocalDate;

public class Client {

    private int idClients;
    private Profile profile;
    private LocalDate registrationDate;
    private boolean status;

    public Client() {
    }

    public Client(int idClients, Profile profile,
                  LocalDate registrationDate, boolean status) {

        this.idClients = idClients;
        this.profile = profile;
        this.registrationDate = registrationDate;
        this.status = status;
    }
}
