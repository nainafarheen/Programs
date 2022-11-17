package practice;

public class TestStatic
{
    public static int TestValue =100;

 

    public TestStatic()
    {

        if (TestValue == 100)
            {
                TestValue = 5;
            }
    }
    
    /*public TestStatic(int TestValue) {
    	this.TestValue=TestValue;
    }*/
    public TestStatic(int tv) {
    	if (TestValue == 100) {
    		TestValue=tv;
    	}
    }
    
    public void TestStatic()
    {
        if (TestValue == 0)
            {
                TestValue = 10;
            }
    }

 

    public void Print()
                                                    {
        if (TestValue == 5)
            {
                TestValue = 6;
            }
        System.out.println("TestValue : " +TestValue);
    }
    public static void main(String args[]) {
    	TestStatic ts = new TestStatic(20);
    	ts.Print();
    	
    }
}