package SuiteTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUnit1 {
    String message="Robert";
    MessageUtil messageUtil= new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        System.out.println("inside testPrintMessage");
        assertEquals(message,messageUtil.printMessage());
    }
}
