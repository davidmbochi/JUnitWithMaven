package AssertionMethods;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestJunit1 {
    @Test
    public void testAdd(){
        int num =5;
        String temp="david";
        String str="JUnit is working fine";

        assertEquals("JUnit is working fine",str);
        assertFalse(num>6);
        assertNotNull(temp);
    }
}
