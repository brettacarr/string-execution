import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormulaInterpolationTest {

  @Test
  public void injectsSingleValueIntoPlaceHolder() {
    Map<String, Double> variables = new HashMap<>();
    variables.put("d", 1d);
    assertEquals("1+1.0", FormulaInterpolation.interpolate("1+{d}", variables));
  }

  @Test
  public void injectsMultipleValueIntoPlaceHolder() {
    Map<String, Double> variables = new HashMap<>();
    variables.put("d", 1d);
    variables.put("t", 5.5d);
    assertEquals("1+1.0+5.5", FormulaInterpolation.interpolate("1+{d}+{t}", variables));
  }

}