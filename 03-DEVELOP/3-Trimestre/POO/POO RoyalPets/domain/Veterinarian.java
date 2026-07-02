package my.company.royalpets.domain;

import java.util.HashSet;
import java.util.Set;

public class Veterinarian {

    private int idVets;
    private Profile profile;
    private String professionalLicense;
    private String speciality;
    private boolean status;

    
    private Set<MedicalAppointment> medicalAppointments;
    private Set<Consultation> consultations;


    public Veterinarian() {
    this.medicalAppointments = new HashSet<>();
    this.consultations = new HashSet<>();
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

        this.medicalAppointments = new HashSet<>();
        this.consultations = new HashSet<>();
        }

    public int getIdVets() {
        return idVets;
    }

    public void setIdVets(int idVets) {
        this.idVets = idVets;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getProfessionalLicense() {
        return professionalLicense;
    }

    public void setProfessionalLicense(String professionalLicense) {
        this.professionalLicense = professionalLicense;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Set<MedicalAppointment> getMedicalAppointments() {
        return medicalAppointments;
    }

    public void setMedicalAppointments(Set<MedicalAppointment> medicalAppointments) {
        this.medicalAppointments = medicalAppointments;
    }

    public Set<Consultation> getConsultations() {
    return consultations;
    }

    public void setConsultations(Set<Consultation> consultations) {
    this.consultations = consultations;
    }
}