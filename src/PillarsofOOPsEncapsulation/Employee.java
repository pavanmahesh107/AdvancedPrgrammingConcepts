package PillarsofOOPsEncapsulation;

public class Employee {
    //The field Salary is declared as private, This prevents direct access to these fields from outside the class.
    //Ensuring that the internal state is protected from unauthorized or unintended modifications.
    private double Salary;


    //Getter methods are provided to allow read access to the private fields.
    //These methods do not modify the internal state but provide a controlled way to access it.
    public double getSalary() {
        return Salary;
    }

    //The setter methods for the fields include complex validation and business logic
    //To ensure that any modifications to the internal state adhere to specific rules and constraints.
    public void setSalary(double Salary) {
        if (Salary > 30000.00 && Salary < 2000000) {
            this.Salary = Salary;
            //This validation logic is part of the encapsulation as it prevents invalid
            //Data from being set, maintaining the integrity of the object's state.
        } else {
            throw new IllegalArgumentException("Salary out of range");
        }
    }
}
//The business logic related to the validation and manipulation of the fields is encapsulated within the class.
//This means that the rules for modifying the fields are hidden from the outside world and are only accessible
//Through the controlled interface of the class (i.e., the setter methods)