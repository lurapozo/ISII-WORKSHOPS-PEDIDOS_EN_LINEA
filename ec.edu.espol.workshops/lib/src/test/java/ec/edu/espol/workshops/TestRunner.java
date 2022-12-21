package ec.edu.espol.workshops;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(StatementCoverageTest.class);

      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }

      System.out.println(result.wasSuccessful());
      
      /*Result result2 = JUnitCore.runClasses(BranchCoverageTest.class);

      for (Failure failure : result2.getFailures()) {
         System.out.println(failure.toString());
      }

      System.out.println(result2.wasSuccessful());
      
      Result result3 = JUnitCore.runClasses(BranchCoverageTest.class);

      for (Failure failure : result3.getFailures()) {
         System.out.println(failure.toString());
      }

      System.out.println(result3.wasSuccessful());*/
   }
}