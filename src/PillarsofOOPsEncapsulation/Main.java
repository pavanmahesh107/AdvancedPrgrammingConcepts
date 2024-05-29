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

//        Account account = new Account();
//        account.deposit(1518.0);
//        account.Withdraw(123.0);
//        System.out.println(account.getBalance());


//        // 3. Read-Only Example
//        ReadonlyExample readonlyExample = new ReadonlyExample(18);
//        System.out.println( readonlyExample.getId());

        // 4 .Encapsulation with Inheritance
        //The private fields in the base class encapsulate the implementation details,
        // hiding them from both external classes and derived classes.
        // This allows the base class to change its internal implementation without affecting the derived classes,
        // as long as the protected methods' interface remains consistent.

//        Derived derived = new Derived();
//        derived.setSecret("Encapsulation with Inheritance");
//        derived.revialSecret();

//        // 5. Complex Validation and Business Logic:
//        Employee employee = new Employee();
//        employee.setSalary(45000.00);
//        System.out.println(employee.getSalary());

        ImmutableClass immutableClass = new ImmutableClass("Pavan", 24);
        ImmutableClass immutableClass1 = new ImmutableClass("Rupa",23);
        System.out.println(immutableClass.getName()+" "+immutableClass.getAge());
        System.out.println(immutableClass1.getName()+" "+immutableClass1.getAge());
//        System.out.println(immutableClass.getAge());
//        System.out.println(immutableClass1.getAge());

    }
}
