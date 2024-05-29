package PillarsofOOPsEncapsulation;

// 4 .Encapsulation with Inheritance
//Encapsulation is maintained through the use of private fields and protected methods in the base class.
public class Base {

    //The base class has private fields that store its internal state.
    private String Secret;

    //The base class provides protected getter and setter methods for accessing and modifying the private fields.

    //Protected methods are accessible within the Same Package and by subclasses, but not by any other external classes.
    //This allows derived classes to interact with the internal state in a controlled manner.
    protected String getSecret() {
        return Secret;
    }

    protected void setSecret(String secret) {
        this.Secret = secret;
    }

}
