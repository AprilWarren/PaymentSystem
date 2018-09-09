public class Main {

    public static void main(String[] args) {
        DebitAccount debit = new DebitAccount();
        debit.setOwnerName("Camron Warren");
        debit.deposit(500);

//        System.out.println(debit.getOwnersName() + " debit account has a balance of " + String.valueOf(debit.getBalance()));

        CreditAccount credit = new CreditAccount();
        credit.setOwnersName("Camron Warren");
        credit.setCreditLimit(1000);

//        credit.withdraw(500);
//        System.out.println(credit.getOwnersName() + " credit account has a balance of " + String.valueOf(credit.getBalance()));
//        credit.withdraw(501);
//        System.out.println(credit.getOwnersName() + " credit account has a balance of " + String.valueOf(credit.getBalance()));
        credit.withdraw(2.00);
    }
}
