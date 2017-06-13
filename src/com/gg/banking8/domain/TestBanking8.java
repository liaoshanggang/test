package com.gg.banking8.domain;

import com.gg.banking8.report.CustomerReport;
/*
 * This class creates the program to test the banking classes.
 * It creates a set of customers, with a few accounts each,
 * and generates a report of current account balances.
 */

public class TestBanking8 {

  public static void main(String[] args) {
    Bank     bank = Bank.getBanking();
    Customer customer;
    CustomerReport report = new CustomerReport();

    // Create several customers and their accounts
    bank.addCustomer("Jane", "Simms");
    customer = bank.getCustomer(0);
    customer.addAccount(new SavingAccount(500.00, 0.05));
    customer.addAccount(new CheckingAccount(200.00, 400.00));

    bank.addCustomer("Owen", "Bryant");
    customer = bank.getCustomer(1);
    customer.addAccount(new CheckingAccount(200.00));

    bank.addCustomer("Tim", "Soley");
    customer = bank.getCustomer(2);
    customer.addAccount(new SavingAccount(1500.00, 0.05));
    customer.addAccount(new CheckingAccount(200.00));

    bank.addCustomer("Maria", "Soley");
    customer = bank.getCustomer(3);
    // Maria and Tim have a shared checking account
    customer.addAccount(bank.getCustomer(2).getAccount(1));
    customer.addAccount(new SavingAccount(150.00, 0.05));

    // Generate a report
    report.generateReport();
  }
}
