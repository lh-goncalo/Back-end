package entity;

public class BusAccount extends account2 {

    private Double loanLimit;

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BusAccount(){}
    
    public BusAccount(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BusAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    } 

    public void loan(double amount){
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }
}
