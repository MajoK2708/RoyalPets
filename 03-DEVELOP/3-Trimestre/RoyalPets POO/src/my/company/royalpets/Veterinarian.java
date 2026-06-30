package my.company.royalpets;

public class Veterinarian {

    private int idVets;
    private Profile profile;
    private String professionalLicense;
    private String speciality;
    private boolean status;

    public Veterinarian() {
    }

    public Veterinarian(int idVets, Profile profile,
                        String professionalLicense,
                        String speciality,
                        boolean status) {

        this.idVets = idVets;
        this.profile = profile;
        this.professionalLicense = professionalLicense;
        this.speciality = speciality;
        this.status = status;
    }
}
