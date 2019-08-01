import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class StringExecutionTest {

  @Test
  public void evaluatesAdditionOfTwoNumbers() {
    assertEquals(new BigDecimal(2.00).setScale(2), StringExecution.execute("1+1"));
  }

  @Test
  public void evaluatesAdditionOfThreeNumbers() {
    assertEquals(new BigDecimal(3.00).setScale(2), StringExecution.execute("1+1+1"));
  }

  @Test
  public void evaluatesMultiplicationOfTwoNumbers() {
    assertEquals(new BigDecimal(4.00).setScale(2), StringExecution.execute("2*2"));
  }

  @Test
  public void evaluatesMixedOperators() {
    assertEquals(new BigDecimal(3.30, new MathContext(2, RoundingMode.HALF_DOWN)).setScale(2), StringExecution.execute(".3 + (.3 * 10)"));
  }

}