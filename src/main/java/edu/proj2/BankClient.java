package edu.proj2;

import java.util.*;

public class BankClient
{
    BankAccount b;
    boolean setup = false;

    public BankClient() {}

    public void newBankAcct()
    {
        if (setup)
        {
            System.out.println("Account already set up");
            return;
        }
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Client Name: ");
        String n = s.nextLine();
        System.out.print("\nEnter Client ID: ");
        String id = s.nextLine();
        System.out.print("\nEnter Initial Balance: ");
        double bal = Double.parseDouble(s.nextLine());
        b = new BankAccount(n, id, bal);
        setup = true;
    }

    public void makeDeposit()
    {
        if (!setup)
        {
            System.out.println("Account must set up before making deposit...");
            return;
        }

        System.out.println("Enter Deposit Amount: ");
        Scanner s = new Scanner(System.in);
        double x = Double.parseDouble(s.nextLine());
        if (x <= 0) {
            System.out.println("Deposit must be positive!");
            return;
        }
        b.deposit(x);
        System.out.println("Deposit Achieved");
    }

    public void makeWithdrawal()
    {
        if (!setup)
        {
            System.out.println("Account must be set up before making withdrawal...");
            return;
        }
        System.out.println("Enter Withdrawal Amount: ");
        Scanner s = new Scanner(System.in);
        double x = Double.parseDouble(s.nextLine());
        if (x <= 0) {
            System.out.println("Deposit");
            return;
        }
        System.out.println("Withdrawal Achieved");
    }

    public void checkBal()
    {
        if (!setup)
        {
            System.out.println("Account must be set up before viewing balance...");
            return;
        }
        System.out.println("Account Balance: " + b.getBal());
    }

    public void checkInfo()
    {
        if (!setup)
        {
            System.out.println("Account must be set up before viewing info...");
            return;
        }
        System.out.println(b.toString());
    }
}