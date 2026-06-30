package my.company.royalpets;

public class Role {

    private int idRoles;
    private String nameRoles;

    public Role() {
    }

    public Role(int idRoles, String nameRoles) {
        this.idRoles = idRoles;
        this.nameRoles = nameRoles;
    }

    public int getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(int idRoles) {
        this.idRoles = idRoles;
    }

    public String getNameRoles() {
        return nameRoles;
    }

    public void setNameRoles(String nameRoles) {
        this.nameRoles = nameRoles;
    }
}
