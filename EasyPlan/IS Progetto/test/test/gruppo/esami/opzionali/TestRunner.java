package test.gruppo.esami.opzionali;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

  /**
   * Metodo main.
   * @param args array riga di comando
   */
  public static void main(String[] args) {

    Result result = JUnitCore.runClasses(JUnitTestSuiteGruppoOpzionale.class);

    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }

    System.out.println(result.wasSuccessful());
  }
}
