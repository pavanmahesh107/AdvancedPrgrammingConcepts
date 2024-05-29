package PillarsofOOPsEncapsulation;

// 2. Simple Validation
public class Account {

    //We declared the Balance variable as private.This means they cannot access directly from outside the class.
    //This is the core aspect of encapsulation.as it hides the internal state of the object from the outside world.
    private double Balance;

    //The Encapsulation is followed through how the Private fields and Public methods
    // that control access to those fields.
    public double getBalance() {
        return Balance;
    }

    //The public methods are provided to allow controlled access to these private fields.
    //These methods act as controlled interface for interacting with the internal state.
    public void deposit(double amount) {   //the deposit method only increases the balance if the amount is positive,
        if (amount > 0) {
            Balance += amount;
        }
    }

    //The setter methods(eg., deposit, Withdraw) include validation logic to ensure that internal state remains valid.

    public void Withdraw(double amount) {   //the withdraw method only decreases the balance
        // if the amount is positive
        // and does not exceed the current balance.
        if (amount > 0 && Balance >= amount) {
            Balance -= amount;
        }
    }
}

//The validation logic prevents invalid states(eg., negative balances) and enforces rules about
//How the state can change, which is an important aspect of maintaining the integrity of the object's data.
