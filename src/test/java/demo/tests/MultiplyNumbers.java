package demo.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiplyNumbers {
    @Parameters({ "n1" , "n2" })
    @Test
    public int multiply(int a, int b)
    {
        int result = a*b;
        System.out.println("Multiply --> " + result);
        return result;
    }
}
