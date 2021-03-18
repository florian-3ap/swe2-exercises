package ch.juventus.logging;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BankTest {

  @Test
  public void testDeposit() {
    Bank bank = new Bank();

    bank.deposit(100.00);

    assertEquals(100.00, bank.retrieveBalance());
  }

  @Test
  public void testWithdraw() {
    Bank bank = new Bank();

    bank.deposit(100.00);

    bank.withdraw(50.00);

    assertEquals(50.00, bank.retrieveBalance());
  }
}
