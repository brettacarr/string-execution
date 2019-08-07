import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormulaEvaluatorTest {

  @Test
  public void evaluateFormulaWithAdditionMultiplication() {
    Map<String, Double> variables = new HashMap<>();
    variables.put("x", 1d);
    variables.put("y", 2d);

    assertEquals(new BigDecimal(30.00).setScale(2), FormulaEvaluator.evaluate("({x}+{y})*10", variables));

  }

  @Test
  public void evaluateFormulaWithDecimals() {
    Map<String, Double> variables = new HashMap<>();
    variables.put("x", .3d);
    variables.put("n", 10d);

    assertEquals(new BigDecimal(3.30).setScale(2), FormulaEvaluator.evaluate("({x}*{n})+{x}", variables));

  }
}