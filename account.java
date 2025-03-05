package entity;

public class account {

    private  int accNumber;
    private  String holder;
    private  double amount;

    public account(int accNumber, String holder){
        this.accNumber = accNumber;
        this.holder = holder;
    }   

    public account(double amount){
        this.amount = amount;
    } 
    
    public int getAccNumber() {
        return accNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double deposit){
        amount = amount + deposit;
    }

    public void withdraw(double withdraw){
        amount = amount - withdraw - 5.00;
    }

}
