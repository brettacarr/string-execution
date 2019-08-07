import java.util.Map;

public class FormulaInterpolation {
  public static String interpolate(String formula, Map<String, Double> variables) {
    String result = formula;
    for (String key : variables.keySet()) {
      Double value = variables.get(key);
      result = result.replaceAll("\\{"+key+"\\}", value.toString());
    }
    return result;
  }
}
