import java.util.*;

public class BankAccount {
    public static int totalAccounts;
    public static double totalAccSum;

    private String accountNumber = "";
    private double checkingBal=0;
    private double savingsBal=0;

    BankAccount(){
        this.accountNumber = randAcc();
        totalAccounts += 1;
    }

    private String randAcc(){
        int[] array = new int[10];
        Random rand = new Random();
        for(int i = 0; i=array.length-1; i++){
            array[i] = rand.nextInt(10);
        }
        return array.toString();
    }

    public double checkingBalance(){
        return this.checkingBal;
    }

    public double SavingBalance(){
        return this.savingsBal;
    }

    public void deposit(int account, double amount){
        if(account == 0){
            this.checkingBal += amount;
        }
        else if(account == 1){
            this.savingsBal += amount;
        }
        else{
            System.out.println("System error! Must be a 0 for checking or 1 for savings!");
        }
    }

    public void withdrawal(int account, double amount){
        if(account == 0 && (this.savingsBal - amount) >= 0){
            this.savingsBal -= amount;
        }
        else if(account == 1 && (this.savingsBal - amount) >= 0){
            this.checkingBal -= amount;
        }
        else{
            System.out.println("Account Wrong, or Not enough Balance.");
        }
    }

    public double totalAccountBal(){
        return this.checkingBal + this.savingsBal;
    }
}