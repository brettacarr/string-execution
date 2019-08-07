import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormulaEvaluatorTest {

  @Test
  public void evaluateFormula() {
    Map<String, Double> variables = new HashMap<>();
    variables.put("x", 1d);
    variables.put("y", 2d);

    assertEquals(new BigDecimal(30.00).setScale(2), FormulaEvaluator.evaluate("({x}+{y})*10", variables));

  }
}