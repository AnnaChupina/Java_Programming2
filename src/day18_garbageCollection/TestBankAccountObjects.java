package day18_garbageCollection;

public class TestBankAccountObjects {


    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Gadir", 1234567);

        System.out.println(obj1);

        obj1.deposit(1000);
        obj1.checkBalance();
        obj1.withdraw(700);
        obj1.checkBalance();
        obj1.deposit(-1000);
        obj1.checkBalance();
        obj1.withdraw(5000);
        obj1.checkBalance();


        System.out.println("________________________");

        BankAccount account1 = new BankAccount();
        account1.setInfo("Sebastian", 48844);
        BankAccount account2 = new BankAccount();
        account2.setInfo("Umran", 224464425);

        account1.deposit(5000);



    }
}
