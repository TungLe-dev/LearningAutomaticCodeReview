package app;

/**
 * Simple calculation utilities used by the exercises/tests.
 */
public class Calculation {

  /** Utility class - prevent instantiation. */
  private Calculation() {
    throw new AssertionError("No instances.");
  }

  /**
   * Adds two numbers.
   *
   * @param a first number
   * @param b second number
   * @return {@code a + b}
   */
  public static double add(double a, double b) {
    return a + b;
  }

  /**
   * Subtracts {@code b} from {@code a}.
   *
   * @param a first number
   * @param b second number
   * @return {@code a - b}
   */
  public static double subtract(double a, double b) {
    return a - b;
  }

  /**
   * Multiplies two numbers.
   *
   * @param a first number
   * @param b second number
   * @return {@code a * b}
   */
  public static double multiply(double a, double b) {
    return a * b;
  }

  public static double divide(double a, double b) {
    if (b == 0) {
      throw new IllegalArgumentException("Division by zero");
    }
    return a / b;
  }

  public static void printFeature() {
    System.out.println("This is a test");
  }

}
