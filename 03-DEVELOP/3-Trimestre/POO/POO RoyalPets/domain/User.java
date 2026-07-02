package my.company.royalpets.domain;

import java.util.HashSet;
import java.util.Set;

public class User {

    private int idUsers;
    private String userName;
    private String email;
    private String password;
    private boolean status;

    // Relación 1:N con Profile
    private Set<Profile> profiles;


    private Set<UserRole> userRoles;

    public User() {
        this.profiles = new HashSet<>();
        this.userRoles = new HashSet<>();
    }

    public User(int idUsers, String userName, String email, String password, boolean status) {
        this.idUsers = idUsers;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.status = status;
        this.profiles = new HashSet<>();
        this.userRoles = new HashSet<>();
    }

    public int getIdUsers() {
        return idUsers;
    }

    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Set<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(Set<Profile> profiles) {
        this.profiles = profiles;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
