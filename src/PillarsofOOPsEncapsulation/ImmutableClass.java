package PillarsofOOPsEncapsulation;

public final class ImmutableClass {

    //The name, age fields are declared private, this means that they cannot be accessed or modified directly from
    // Outside the class, Which is a key Aspect of encapsulation,
    private final String name;

    private final int age;

    //The fields are declared final, which means they can only be assigned once.
    //This prevents fields from being changed after they are initialized, Contributing to the immutability of the object.
    private String College;
    public String City;

    //When a field is declared as final, it must be initialized when it is declared or within the constructor.
    // Once assigned, its value cannot be changed.
    public ImmutableClass(String name,int age){
        this.name = name;
        this.age = age;
    }

    //The constructor is used to set the initial values of the fields. Since the fields are final,
    // they must be initialized within the constructor and cannot be changed afterward.
    // This ensures that the object's state is set only once, at the time of creation.

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
//No Setter Method - The class does not provide any setter methods for the fields.
// This prevents any modifications to the fields after the object is created, maintaining the immutability of the object.

//Public Getter Method - Getter methods are provided to allow read access to the private fields.
// These methods do not allow the state to be modified, only read, ensuring that the internal state remains unchanged.