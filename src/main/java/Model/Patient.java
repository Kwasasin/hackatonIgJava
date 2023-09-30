package Model;

public class Patient {
    private String first_name;
    private String last_name;
    private int age;
    private String gender;
    private double height;
    private double weight;

    public Patient(String first_name, String last_name, int age, String gender, double height, double weight) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public double get_bmi() {
        return weight / (height * height);
    }
}
