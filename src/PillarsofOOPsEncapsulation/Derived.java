package PillarsofOOPsEncapsulation;


//The fields are not directly accessible from outside the class, including from any derived class.
// This ensures that the internal state of the base class remains protected and cannot be directly modified by derived classes.
public class Derived extends Base{
    public void revialSecret(){
        System.out.println("Revealing the Secret: "+getSecret());
    }
}

//Derived classes can use the protected methods to access and modify the internal state of the base class.
// This ensures that any interaction with the base class's internal state goes through the controlled interface provided by the base class,
// maintaining the integrity of the encapsulation.