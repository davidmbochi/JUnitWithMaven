package SuiteTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUnit2 {
    String message ="Robert";
    MessageUtil messageUtil= new MessageUtil(message);

    @Test
    public void testSalutationMessage(){
        System.out.println("inside testSalutationMessage");
        message="Hi"+"Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}
