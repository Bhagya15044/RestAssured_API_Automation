package org.example.ex_02_RA_Concepts;

public class APITesting_Lab_04_BP
{
    //we take the NDP function as it is but call the self(APITesting_Lab_04_BP) instead of void and return the reference

    public APITesting_Lab_04_BP Step1()
    {
        System.out.println("Step-1");
        return this;
    }

    public APITesting_Lab_04_BP Step2()
    {
        System.out.println("Step-2");
        return this;
    }

    public APITesting_Lab_04_BP Step3(String parameter)
    {
        System.out.println("Step-3");
        return this;
    }

    public static void main(String[] args)
    {
        APITesting_Lab_04_BP BP = new APITesting_Lab_04_BP();
        BP.Step1().Step2().Step3("Bhagya");
    }
}
