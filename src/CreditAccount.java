public class CreditAccount {

    private String ownersName = "";
    private int creditLimit = 0;
    private double balance = 0;

    public void deposit(double depositAmount){
        this.balance -= depositAmount;
        this.getBalance();
    }

    public String withdraw(double withdrawalAmount){
        if(this.balance + withdrawalAmount <= creditLimit) {
            this.balance += withdrawalAmount;
            this.getBalance();
            System.out.println("Transaction Approved");
            return "Approved";
        }
        else{
            System.out.println("Transaction Declined");
            return "Declined";
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public void setOwnersName(String newName){
        this.ownersName = newName;
    }

    public String getOwnersName(){
        return this.ownersName;
    }

    public void setCreditLimit(int newCreditLimit){
        this.creditLimit = newCreditLimit;
    }

}
