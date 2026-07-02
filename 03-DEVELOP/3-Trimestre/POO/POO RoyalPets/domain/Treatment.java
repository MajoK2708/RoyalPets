package my.company.royalpets.domain;

public class Treatment {

    private int idTreatment;
    private Consultation consultation;
    private String treatmentName;
    private String description;
    private String medication;
    private String dosage;
    private String indications;

    public Treatment() {
    }

    public Treatment(int idTreatment,
                     Consultation consultation,
                     String treatmentName,
                     String description,
                     String medication,
                     String dosage,
                     String indications) {

        this.idTreatment = idTreatment;
        this.consultation = consultation;
        this.treatmentName = treatmentName;
        this.description = description;
        this.medication = medication;
        this.dosage = dosage;
        this.indications = indications;
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

    public String getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getIndications() {
        return indications;
    }

    public void setIndications(String indications) {
        this.indications = indications;
    }
}
