import java.math.BigDecimal;
import java.util.Map;

public class FormulaEvaluator {

  public static BigDecimal evaluate(String formula, Map<String, Double> variables) {
    return StringExecution.execute(FormulaInterpolation.interpolate(formula,variables));
  }
}
