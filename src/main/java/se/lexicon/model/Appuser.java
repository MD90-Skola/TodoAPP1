package se.lexicon.model;

import java.util.Objects;

public class Appuser {


    private String username;
    private String password;
    private AppRole role;

    public Appuser(String username, String password, AppRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username==null){
            throw new IllegalArgumentException("name shuld not be null");
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null)
            throw new IllegalArgumentException("password shuld not be null");
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (role==null){
            throw new IllegalArgumentException("app role shuld not be null");

        }
        this.role = role;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Appuser appuser = (Appuser) o;
        return Objects.equals(username, appuser.username) && role == appuser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, role);
    }

    @Override
    public String toString() {
        return "Appuser{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }
}
