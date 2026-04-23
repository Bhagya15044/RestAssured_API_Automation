package org.example.TestNG_Examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting_018_TestNG_Parameter
{
    /*
     Here first we created testng file with parameter passed like chrome.
     Here added the parameter's annotations with name browser,
     So from testng it will pick the chrome value and passed here to string value and compare the chrome value and execute
     The Same for firefox as well. However, the code is the same, we can create another TestNg file with name firefox
    */
    @Parameters("browser")
   @Test
    public void demo1(String value)
   {
       System.out.println("Hi Demo1");
       System.out.println("I am running this parameter");

       if(value.equalsIgnoreCase("Firefox"))
       {
           System.out.println("Start the firefox");
       }

       if(value.equalsIgnoreCase("Chrome"))
       {
           System.out.println("Start the Chrome");
       }
   }
}
