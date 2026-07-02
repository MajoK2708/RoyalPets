package my.company.royalpets.domain;

import java.util.HashSet;
import java.util.Set;

public class DocumentType {

    private int idDocumentType;
    private String nameType;

    // Un tipo de documento puede estar en muchos perfiles
    private Set<Profile> profiles;

    public DocumentType() {
        this.profiles = new HashSet<>();
    }

    public DocumentType(int idDocumentType, String nameType) {
        this.idDocumentType = idDocumentType;
        this.nameType = nameType;
        this.profiles = new HashSet<>();
    }

    public int getIdDocumentType() {
        return idDocumentType;
    }

    public void setIdDocumentType(int idDocumentType) {
        this.idDocumentType = idDocumentType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public Set<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(Set<Profile> profiles) {
        this.profiles = profiles;
    }
}
