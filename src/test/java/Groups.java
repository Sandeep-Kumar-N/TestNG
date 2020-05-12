import org.testng.annotations.Test;

public class Groups {

    @Test(groups = "GP1")
    public void m1() {
        System.out.println("m1");
    }
    @Test(groups = "GP2")
    public void m2() {
        System.out.println("m2");
    }
    @Test(groups = "GP3")
    public void m3() {
        System.out.println("m3");
    }
    @Test(groups = "GP1")
    public void m4() {
        System.out.println("m4");
    }
    @Test(groups = "GP1")
    public void m5() {
        System.out.println("m5");
    }
    @Test(groups = "GP2")
    public void m6() {
        System.out.println("m6");
    }
}
