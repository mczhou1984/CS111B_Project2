//By Segev Malool, Matt,

package edu.proj2;

import java.util.*;

public class BankAccount
{
    private String name, ID;
    private double balance;

    public BankAccount(String n, String id, double b)
    {//balance may be negative
        if (n.length() == 0) throw new IllegalArgumentException("Name length must be positive...");
        if (id.length() == 0) throw new IllegalArgumentException("ID length must be positive...");
        name = n;
        ID = id;
        balance = b;
    }

    public String getName() { return name; }
    public String getID() { return ID; }
    public double getBal() { return balance; }

    public void setName(String n)
    {
        if (n.length() == 0) throw new IllegalArgumentException("Name length must be positive...");
        name = n;
    }
    public void getName(String id)
    {
        if (id.length() == 0) throw new IllegalArgumentException("ID length must be positive...");
        ID = id;
    }
    //balance is not set directly, only accumulates.

    public void withdraw(double withdrawal)
    {
        if (withdrawal < 0) throw new IllegalArgumentException("Withdrawal must be positive...");
        balance -= withdrawal;
    }
    public void deposit(double deposit)
    {
        if (deposit < 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += deposit;
    }

    @Override
    public String toString()
    {
        return String.format("Client Name: %s\nClient ID: %s\nAccount Balance: %6.2f\n", name, ID, balance);
    }


}