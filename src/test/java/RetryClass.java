import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryClass{
    public int cntr=1;

    @Test(retryAnalyzer = Utils.Retry.class)
    public void rerun_this_method1(){
        System.out.println("rerun_this_method1: rerunning attempt:"+cntr);
        cntr++;
        Assert.assertTrue(false);
    }


    @Test
    public void rerun_this_method2(){
        System.out.println("rerun_this_method2: rerunning attempt:"+cntr);
        cntr++;
        Assert.assertTrue(true);
    }


    @Test
    public void rerun_this_method3(){
        System.out.println("rerun_this_method3: rerunning attempt:"+cntr);
        cntr++;
        Assert.assertTrue(false);
    }
    @Test()
    public void rerun_this_method4(){
        System.out.println("rerun_this_method4: rerunning attempt:"+cntr);
        cntr++;
        Assert.assertTrue(false);
    }

}
