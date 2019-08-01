import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class StringExecution{

  public static BigDecimal execute(String formula) {

    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    Double result=null;
    try {

      result = Double.parseDouble(engine.eval(formula).toString());

    } catch (ScriptException e) {
      e.printStackTrace();
    }

    return new BigDecimal(result).setScale(2, RoundingMode.HALF_DOWN);
  }
}