package springboot.webapp.models;

public class User {
    private String username;
    private String password;
    private Patient patient;

    public User(String username, String password, Patient patient) {
        this.username = username;
        this.password = password;
        this.patient = patient;
        System.out.println("hi");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Patient getPatient() {
        return patient;
    }
}