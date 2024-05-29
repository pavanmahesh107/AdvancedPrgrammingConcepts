package PillarsofOOPsEncapsulation;

public class Main {
    public static void main(String[] args) {

        // 1. Basic data protection

//        Person person = new Person();
//        person.setName("Pavan Mahesh");
//        person.setAge(18);
//        System.out.println(person.getName());
//        System.out.println(person.getAge());
//
//        Person person1 = new Person();
//        person1.setName("Rupa");
//        person1.setAge(15);
//        System.out.println(person1.getName());
//        System.out.println(person1.getAge());

        // 2. Simple Validation

        Account account = new Account();
        account.deposit(1518.0);
        account.Withdraw(123.0);
        System.out.println(account.getBalance());



    }
}
