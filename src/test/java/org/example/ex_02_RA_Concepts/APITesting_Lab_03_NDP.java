package org.example.ex_02_RA_Concepts;

public class APITesting_Lab_03_NDP
{
    //No Builder Pattern

    public  void Step1()
    {
        System.out.println("Step-1");
    }

    public  void Step2()
    {
        System.out.println("Step-2");
    }

    public  void Step3(String parameter)
    {
        System.out.println("Step-3");
    }

    public static void main(String[] args)
    {
        APITesting_Lab_03_NDP Ndp = new APITesting_Lab_03_NDP();
        Ndp.Step1();
        Ndp.Step2();
        Ndp.Step3("Bhagya");
    }
}
