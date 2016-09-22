package edu.proj2;

import java.util.*;

public class BankUser
{
    public static void main(String[] args) {

        BankClient c = new BankClient();
        Scanner s = new Scanner(System.in);
        int selection = -1;
        System.out.println("Bank Account Program!\n Please enter a selection (1,2,3...):");

        do {
            System.out.println("1. Establish Account");
            System.out.println("2. Make Deposit");
            System.out.println("3. Make Withdrawal");
            System.out.println("4. Check Account Balance");
            System.out.println("5. Check Account Information");
            System.out.println("6. Quit");
            selection = Integer.parseInt(s.nextLine());

            switch (selection) {
                case 1:
                    c.newBankAcct();
                    break;
                case 2:
                    c.makeDeposit();
                    break;
                case 3:
                    c.makeWithdrawal();
                    break;
                case 4:
                    c.checkBal();
                    break;
                case 5:
                    c.checkInfo();
            }
        } while (selection != 6);
    }
}