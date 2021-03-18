package ch.juventus.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bank {

  private final Logger logger = LoggerFactory.getLogger(Bank.class);

  private double accountBalance;

  public void withdraw(double amount) {
    logger.info("Withdraw {} from account!", amount);
    accountBalance -= amount;
  }

  public void deposit(double deposit) {
    logger.info("Deposit {} in the account!", deposit);
    accountBalance += deposit;
  }

  public double retrieveBalance() {
    logger.info("Retrieve balance from account!");
    return accountBalance;
  }
}
