package my.company.royalpets;

public class DocumentType {

    private int idDocumentType;
    private String nameType;

    public DocumentType() {
    }

    public DocumentType(int idDocumentType, String nameType) {
        this.idDocumentType = idDocumentType;
        this.nameType = nameType;
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
}
