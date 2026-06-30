package my.company.royalpets;

public class User {

    private int idUsers;
    private String userName;
    private String email;
    private String password;
    private boolean status;

    public User() {
    }

    public User(int idUsers, String userName, String email, String password, boolean status) {
        this.idUsers = idUsers;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.status = status;
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
}
