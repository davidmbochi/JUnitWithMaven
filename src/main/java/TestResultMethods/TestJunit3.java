package TestResultMethods;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit3 extends TestResult {
    public synchronized void addError(Test test, Throwable t){
        super.addError((junit.framework.Test) test, t);
    }
    public synchronized void addFailure(Test test, AssertionFailedError t){
        super.addFailure((junit.framework.Test) test, t);
    }
    @Test
    public void testAdd(){
        String message="hello david";
        assertEquals("hello david",message);
    }
    public synchronized void stop(){
        System.out.println("===>Test stopped");
    }
}
