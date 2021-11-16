package main;

import java.util.Objects;

public class BankUser {

    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;

    public BankUser(String firstName, String lastName, String email, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName =firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getEmail(){
        return  email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String toFileString(){
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(firstName).append(", ")
                    .append(lastName).append(", ")
                .append(email).append(", ")
                .append(username).append(", ")
                .append(password);
        return stringbuilder.toString();
    }

    public boolean equals(Object o){
        if (this==o) return true;
        if (o==null || getClass() != o.getClass()) return false;
        BankUser bankUser=(BankUser) o;
        return Objects.equals(firstName, bankUser.firstName)
                && Objects.equals(lastName, bankUser.lastName)
                && Objects.equals(email, bankUser.email)
                && Objects.equals(username, bankUser.username)
                && Objects.equals(password, bankUser.password);
    }
    public int hashCode(){
        return Objects.hash(firstName, lastName, email, username, password);
    }

    public String toString(){
        return "BankUser{"+
                "firstName='"+firstName+'\''+
                ", lastName='"+lastName+'\''+
                ", email='"+email+'\''+
                ", username='"+username+'\''+
                ", password='"+password+'\''+
                '}';
    }
}
