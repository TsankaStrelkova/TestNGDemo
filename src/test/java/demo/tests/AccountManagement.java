package demo.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountManagement {
    @BeforeClass
    public void prepare() {
        System.out.println("BEFORE CLASS");
    }

    @AfterClass
    public void finish() {
        System.out.println("AFTER CLASS");
    }

    @Test(groups = {"regression","production"})
    public void createAccount() {
        System.out.println("Test method - Create account");
    }

    @Test(groups = {"regression"})
    public void updateAccount() {
        System.out.println("Test method - Update account");
    }

    @Test(groups = {"production"})
    public void deleteAccount() {
        System.out.println("Test method - Delete account");
    }

    @Test
    public void makeSomethingDifferent() {
        System.out.println("Test method - Make something different");
    }
}
