package my.company.royalpets;

public class Profile {

    private int idProfile;
    private User user;
    private DocumentType documentType;
    private String phone;
    private String firstName;
    private String secondName;
    private String firstLastName;
    private String secondLastName;
    private String documentNumber;

    public Profile() {
    }

    public Profile(int idProfile, User user, DocumentType documentType,
                   String phone, String firstName, String secondName,
                   String firstLastName, String secondLastName,
                   String documentNumber) {

        this.idProfile = idProfile;
        this.user = user;
        this.documentType = documentType;
        this.phone = phone;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.documentNumber = documentNumber;
    }
}
