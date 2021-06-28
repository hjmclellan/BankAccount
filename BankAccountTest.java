package models;
import org.junit.Test;

class BankAccountTest {
    public static void main(String[] args){

        BankAccount bank = new BankAccount();
        System.out.println(BankAccount.totalAccMade);
        bank.deposit(0, 18900);
        bank.withdrawal(1, 89);
        System.out.println(bank.totalAccountBal());

}