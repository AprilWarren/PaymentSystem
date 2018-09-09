public class DebitAccount {
    private String ownerName = "";
    private double balance = 0;

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        this.getBalance();
    }
    public void withdraw(double withdrawalAmount){
        this.balance -= withdrawalAmount;
        this.getBalance();
    }

    public double getBalance(){
        double currentBalance = this.balance;
        return currentBalance;
    }

    public void setOwnerName(String name){
        this.ownerName = name;
    }

    public String getOwnersName(){
        return this.ownerName;
    }

}
