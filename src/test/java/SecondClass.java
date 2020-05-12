import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondClass {

    @Test(timeOut = 1)
    public void timeOut() {
        while(true){
            System.out.println("throws error if test not fininshed in specified timeout");

        }
    }

    @Test(invocationTimeOut = 1, enabled = false)
    public void invocationTimeout(){
        while(true){
            System.out.println("throws error if test not fininshed in specified invocationTimeout");
        }
    }

    @Test(invocationCount = 2)
    public void invocationCount(){
        System.out.println("repeats the test for specified number of times i.e invocationCount");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void with_exception() {
        String x="1111A";
        Integer.parseInt(x);
    }

    @Test
    @Parameters({"param1", "param2"})
    public void with_parameters_from_testng_xml(String p1, String p2) {
        System.out.println("Parameter value for 1st param is "+p1);
        System.out.println("Parameter value for 2nd param is "+p2);
    }
}
