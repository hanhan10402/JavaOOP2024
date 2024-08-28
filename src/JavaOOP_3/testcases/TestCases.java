package JavaOOP_3.testcases;

import JavaOOP_3.common.BaseTest;

public class TestCases extends BaseTest {
    public void CRM(){
        System.out.println("Step 1: Open login page https://cms.anhtester.com/login");
        System.out.println("Step 2: Enter email admin@example.com");
        System.out.println("Step 3: Enter password 123456");
        System.out.println("Step 4: Click login button.");
    }

    public void Login(){
        createDriver();
        CRM();
        closeDriver();
    }
    public void Add(){
        System.out.println("Step 5: Click Products button.");
        System.out.println("Step 6: Click Category button.");
        System.out.println("Step 7: Click Add New category button.");
        System.out.println("Step 8: Enter Name.");
        System.out.println("Step 9: Click Save button.");
    }
    public void AddCategory(){
        createDriver();
        CRM();
        Add();
        closeDriver();
    }

    public static void main(String[] args) {
        TestCases testCase = new TestCases();
        testCase.Login();
        System.out.println("==========================");
        testCase.AddCategory();
    }
}
