package org.example.TestAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Assertions
{
    //HardAssertion
    @Test(enabled = true)
    public void test_hard_assert_example()
    {
        System.out.println("Start of the program");
        boolean is_bhagya_male = false;
        Assert.assertEquals("bhagya","BHAGYA");
        System.out.println("End of the program");
    }

    // if we don't want to stop the execution of the program
    @Test
    public void test_soft_Assert_example()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("bhagya","BHAGYA");
        System.out.println("END OF THE PROGRAM");
        softAssert.assertAll();
    }
}
