package TestAssertions;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestAssertions {
    @Test
    public void testAssertions(){
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = null;
        String str4 = "abc";
        String str5= "abc";

        int val1=5;
        int val2=6;
        String[] expextedArray={"one","two","three"};
        String[] resultArray= {"one","two","three"};

        assertEquals(str1,str2);

        assertFalse(val1>val2);

        assertNotNull(str1);

        assertNull(str3);

        assertSame(str4,str5);

        assertNotSame(str1,str3);

        assertArrayEquals(expextedArray,resultArray);


    }
}
