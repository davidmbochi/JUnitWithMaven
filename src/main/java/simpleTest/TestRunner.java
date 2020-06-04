package simpleTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import simpleTest.TestJunit;

public class TestRunner {
    public static void main(String[] arg){
        Result result = JUnitCore.runClasses(TestJunit.class);
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
