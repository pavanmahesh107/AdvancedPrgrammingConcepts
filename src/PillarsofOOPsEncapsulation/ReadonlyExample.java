package PillarsofOOPsEncapsulation;

//Encapsulation is followed by private fields and providing only getter methods, not setter methods.
//Thus ensuring that the state of the object cannot be modified after it is initialized.
public class ReadonlyExample {

    //The private field, this prevents direct access to the internal state from outside the class, Which is a fundamental aspect of encapsulation.
    private int id;

    //The constructor is used to set the initial values of the fields when the object is created.
    // This ensures that the fields are properly initialized when the object is instantiated.
    public ReadonlyExample(int id){
        this.id = id;
    }

    //Public getter methods
    //Public getter methods are provided to allow read access to the private fields.
    // These methods enable other classes to view the state of the object without modifying it.

    public int getId() {
        return id;
    }
}

//No Setter methods - By not providing setter methods for the fields, the class ensures that once the fields are set during object creation.
//Their values cannot be changed. This makes the fields read-only, providing a level of immutability.