package demo.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestManagmentWithDataProvider {
    // it is a test that demonstrates how to run it several times
// Data provide is used for that purpose
// with @DataProvider annotation should be created a method that returns Object[][]
// the name of this method (that returns data as multidimensional array) should be referenced after @Test annotation
    @Test(dataProvider = "credentialsData")
    public void createUserWithEmailPassword(String email, String password) {
        System.out.println("Email --> " + email);
        System.out.println("Password --> " + password);
    }

    @DataProvider
    public Object[][] credentialsData() {
        Object[][] credentials = new Object[2][2];
        credentials[0][0] = "first@user.com";
        credentials[0][1] = "password_one";

        credentials[1][0] = "second@user.com";
        credentials[1][1] = "password_two";

        return credentials;
    }
}
