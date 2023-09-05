package exercises;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setAge(int age) {
        this.age = (age >= 0 && age <= 100) ? age : 0;
    }

    public boolean isTeen() {
        return (this.age > 12 && this.age < 20);
    }

    public String getFullName() {
        String firstName = this.firstName;
        String lastName = this.lastName;

        if (firstName.isEmpty() && lastName.isEmpty()) return "";
        if (firstName.isEmpty()) return lastName;
        if (lastName.isEmpty()) return firstName;

        return firstName + " " + lastName;
    }
}
