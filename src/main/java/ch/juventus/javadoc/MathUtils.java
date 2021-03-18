package ch.juventus.javadoc;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Provides utility method for executing mathematical calculations
 *
 * @author Florian Näpflin
 */
public class MathUtils {

  private MathUtils() {}

  /**
   * Calculates the sum of all number.
   *
   * @param numbers numbers to be added together
   * @return the sum of all number
   */
  public static double addition(List<Double> numbers) {
    return numbers.stream().mapToDouble(value -> value).sum();
  }

  /**
   * Returns the difference of the number
   *
   * @param a the first number
   * @param b the second number to subtract from the first
   * @return the result
   */
  public static double subtraction(double a, double b) {
    return a - b;
  }

  /**
   * Divides two numbers
   *
   * @param a the first number
   * @param b the second number
   * @return the result
   */
  public static double division(double a, double b) {
    return a / b;
  }

  /**
   * Multiplies two numbers with each other
   *
   * @param a first value
   * @param b second value
   * @return the result
   */
  public static double multiplication(double a, double b) {
    return a * b;
  }
}
