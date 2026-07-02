package my.company.royalpets.domain;

import java.util.HashSet;
import java.util.Set;

public class Role {

    private int idRoles;
    private String nameRoles;

    
    private Set<UserRole> userRoles;

    public Role() {
        this.userRoles = new HashSet<>();
    }

    public Role(int idRoles, String nameRoles) {
        this.idRoles = idRoles;
        this.nameRoles = nameRoles;
        this.userRoles = new HashSet<>();
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

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
