package aplication;
import entity.BusAccount;
import entity.account2;
import entity.saveAcount;

public class program1 {

    public static void main(String[] args) {

        account2 acc = new account2(1001, "Alex", 0.0);
        BusAccount bus = new BusAccount(1002, "Maria", 0.0, 500.0);

        // upcasting

        account2 acc1 = bus;
        account2 acc2 = new BusAccount(1003, "Bob", 0.0, 200.0);
        account2 acc3 = new saveAcount(1004, "Anna", 0.0, 0.01);

        // downcasting

        BusAccount acc4 = (BusAccount)acc2;
        acc4.loan(100.0);

        // BusAccount acc5 = (BusAccount) acc3;
        if (acc3 instanceof BusAccount){
            BusAccount acc5 = (BusAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof saveAcount){
            saveAcount acc5 = (saveAcount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
    
}
