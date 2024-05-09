package demo.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumNumbers {
    @Parameters({ "n1" , "n2" })
    @Test
    public void addNumbers(int x, int y) {
        int result = x+y;
        System.out.println("Sum is -->"+ result);
    }
}
