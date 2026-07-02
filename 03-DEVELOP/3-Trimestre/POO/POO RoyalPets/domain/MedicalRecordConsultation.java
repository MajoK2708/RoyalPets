package my.company.royalpets.domain;

public class MedicalRecordConsultation {

    private MedicalRecord medicalRecord;
    private Consultation consultation;

    public MedicalRecordConsultation() {
    }

    public MedicalRecordConsultation(MedicalRecord medicalRecord, Consultation consultation) {
        this.medicalRecord = medicalRecord;
        this.consultation = consultation;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }
}
