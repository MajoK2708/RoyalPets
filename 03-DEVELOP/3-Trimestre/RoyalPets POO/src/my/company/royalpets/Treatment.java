package my.company.royalpets;

public class Treatment {

    private int idTreatment;
    private Consultation consultation;
    private String description;
    private String medication;

    public Treatment() {
    }

    public Treatment(int idTreatment,
                     Consultation consultation,
                     String description,
                     String medication) {

        this.idTreatment = idTreatment;
        this.consultation = consultation;
        this.description = description;
        this.medication = medication;
    }

    public int getIdTreatment() {
        return idTreatment;
    }

    public void setIdTreatment(int idTreatment) {
        this.idTreatment = idTreatment;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public String getDescription() {
        return description;
    }

    public String getMedication() {
        return medication;
    }
}
