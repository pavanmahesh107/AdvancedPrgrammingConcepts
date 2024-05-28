package PillarsofOOPs;

//Basic data protection using Encapsulation
public class Person {
    private String name;
    private int age;

    //Getter methods provide a way to access the values of private fields from outside the class.
    public String getName() {
        return name;
    }

    //Setter methods provide a way to modify the values of private fields from outside the class.
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 20) {
            this.age = age;
        }
    }
}
