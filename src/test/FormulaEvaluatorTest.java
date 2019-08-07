import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormulaEvaluatorTest {

  MathContext mathContext = new MathContext(2, RoundingMode.HALF_DOWN);

  @Test
  public void evaluateFormulaWithAdditionMultiplication() {
    Map<String, Double> variables = new HashMap<>();
    variables.put("x", 1d);
    variables.put("y", 2d);

    assertEquals(new BigDecimal(30.00, mathContext).setScale(2), FormulaEvaluator.evaluate("({x}+{y})*10", variables));

  }

  @Test
  public void evaluateFormulaWithDecimals() {
    Map<String, Double> variables = new HashMap<>();
    variables.put("x", .3d);
    variables.put("n", 10d);


    assertEquals(new BigDecimal(3.30d, mathContext).setScale(2), FormulaEvaluator.evaluate("({x}*{n})+{x}", variables));

  }
}