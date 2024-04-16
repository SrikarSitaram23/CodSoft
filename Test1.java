import java.util.Scanner;
class BankAccount 
{
    private double balance;
    public BankAccount(double balance) 
    {
        this.balance = balance;
    }
    public boolean withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println(amount + " is withdrawn.");
            return true;
        } 
        else 
        {
            System.out.println("Required amount cannot be dispensed.");
            return false;
        }
    }
    public boolean deposit(double amount) 
    {
        if (amount > 0) 
        {
            System.out.println(amount + " is deposited.");
            balance += amount;
            return true;
        } 
        else 
        {
            System.out.println("Amount cannot be deposited. Please try again!");
            return false;
        }
    }
    public double checkBalance() 
    {
        return balance;
    }
}


class ATM 
{
    private Scanner sc;
    private BankAccount acc;
    public ATM(BankAccount acc) 
    {
        this.acc = acc;
        this.sc = new Scanner(System.in);
    }
    public void run() 
    {
        while (true) 
        {
            System.out.println("Enter action to perform:");
            System.out.println("1. Withdraw amount");
            System.out.println("2. Deposit amount");
            System.out.println("3. Check account balance");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) 
            {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again!");
            }
        }
    }
    public void withdraw() 
    {
        System.out.print("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        if (acc.withdraw(amount)) 
        {
            System.out.println("Withdrawal successful.");
        } 
        else 
        {
            System.out.println("Withdrawal failed.");
        }
    }
    public void deposit() 
    {
        System.out.print("Enter the amount to deposit: ");
        double amount = sc.nextDouble();
        if (acc.deposit(amount)) 
        {
            System.out.println("Deposit successful.");
        } 
        else 
        {
            System.out.println("Deposit failed.");
        }
    }
    public void checkBalance() 
    {
        double balance = acc.checkBalance();
        System.out.println("Your current balance is: " + balance);
    }
}


public class Test1 
{
    public static void main(String[] args) 
    {
        BankAccount ba = new BankAccount(800);
        ATM atm = new ATM(ba);
        atm.run();
    }
}