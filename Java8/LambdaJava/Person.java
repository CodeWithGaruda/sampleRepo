package Java8.LambdaJava;

/**
 * person class with firstName lastName age
 */
public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", firstname=" + firstname + ", lastname=" + lastname + "]";
    }

    public void setAge(int age) {
        this.age = age;
    }

}
