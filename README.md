It is a demo project for TestNG
https://testng.org/#_testng_documentation

https://www.tutorialspoint.com/testng/index.htm

It shows how to use:

1. @Test - annotation for tests
2. Priority
Default priority is 0 and execution order will be in alphabetical order where Uppercase letters takes high priority that lower case letters.
To change the default order use attribute **priority**

@Test(priority=1)

3. @BeforeMethod - annotated method will be run before each test method. 
4. @AfterMethod - annotated method will be run after each test method.
5. @BeforeClass - annotated method will be run ONCE before the class
6. @AfterClass - annotated method will be run ONCE after the class

7. TestNG.xml - configuration file to control test execution (see example)
 This file can be named as you like. Only the extension should be .xml
 It has the following structure:

<suite name="Some name of the suite">
  <test name="Some name">
   <groups>
            <run>
                <include name="regression"></include>
            </run>
    </groups>
     <classes>
       <class name="path to the file with tests">
         <methods>
           <include name="name of the method as  is written in the java class"
         </methods>
       </class>
    </classes>
  </test>
</suite>

 **Important**
   If you use include/exclude for methods in testng.xml don't use priority attribute for tests


8. Run specific tests/methods or make parametrization 
 It is illustrated in different .xml files (test runners)
     specifitests.xml
     parametrized_on_suit_level.xml
     parametrized_on_test_level.xml
To run specific tests or use parametrization on suit or test level

**Important**
Methods that represents tests (written after @Test annotation has no returns they are void. 
If you like to have tests where methods has return , please add in the testng.xml in <suit> the following verbose="2" allow-return-values="true")


9. Parametrization using DataProvider - check TestManagmentWithDataProvider 
10. Parametrization using class where DataProvider methods are listed - it is useful when many cases have data provider . 
    It is easy to maintain tests if data are provided in a separate class. Check https://www.udemy.com/course/rest-assured-java-api-automation-for-beginners/learn/lecture/37979520#notes:~:text=140.-,TestNG,-%2D%20Data%20Provider%20%2D%20Centralised