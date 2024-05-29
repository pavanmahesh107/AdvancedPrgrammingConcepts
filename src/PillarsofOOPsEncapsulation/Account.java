package PillarsofOOPsEncapsulation;

public class Account {
    private double Balance;

    public double getBalance() {
        return Balance;
    }

    public double deposit(double amount){
        if(amount > 0){
            Balance += amount;
        }
        return  Balance;
    }

    public double Withdraw(double amount){
        if(amount > 0 && Balance >= amount){
            Balance -= amount;
        }
        return Balance;
    }
}
