package Sprint1.person;

public class Person {
    private String Name;
    private int Age;
    private String address;

    public Person(String name, int age, String address) {
        this.Name = name;
        this.Age = age;
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
