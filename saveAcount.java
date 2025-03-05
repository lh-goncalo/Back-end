package entity;

public class saveAcount extends account2 {
    
    private Double interestRate;

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public saveAcount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public saveAcount() {
    }
    
    public void updateBalance(){
        balance += balance * interestRate;
    }

}
