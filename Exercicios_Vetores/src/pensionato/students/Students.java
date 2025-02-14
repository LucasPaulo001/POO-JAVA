package pensionato.students;

public class Students {

    public  String name;
    public String email;

    public Students(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return name + email;
    }
}
