package ch.juventus.javadoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MathUtilsTest {

  @Test
  public void shouldReturn6WhenSum1And2And3() {
    List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0);
    final double result = MathUtils.addition(doubles);

    assertEquals(6.0, result);
  }

  private static Stream<Arguments> provideValuesForSubtraction() {
    return Stream.of(
        Arguments.of(4.0, 2.0, 2.0),
        Arguments.of(5.0, 2.0, 3.0),
        Arguments.of(6.0, 2.0, 4.0),
        Arguments.of(7.0, 2.0, 5.0));
  }

  @ParameterizedTest
  @MethodSource("provideValuesForSubtraction")
  public void testSubtraction(double a, double b, double expected) {
    final double result = MathUtils.subtraction(a, b);

    assertEquals(expected, result);
  }

  @Test
  public void shouldReturn2WhenDivide2With2() {
    final double result = MathUtils.division(4.0, 2.0);

    assertEquals(2.0, result);
  }

  @Test
  public void shouldReturn6WhenMultiply4With2() {
    final double result = MathUtils.multiplication(4.0, 2.0);

    assertEquals(8.0, result);
  }
}
