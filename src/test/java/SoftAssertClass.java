import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass {
    SoftAssert softAssert = new SoftAssert();

@Test
    public void testSoftAssert1() {
    int a=1;
    int b=2;

    System.out.println("Printing a="+a);
    System.out.println("Printing b="+b);

    softAssert.assertTrue(a==b,"comparing a and b");
    softAssert.assertAll();
    System.out.println("This will not print if test failes as " +
            "Failing the test if any failures in current test by asertAll method");
}
@Test
    public void testSoftAssert2() {
        int a=1;
        int b=2;

        System.out.println("Printing a="+a);
        System.out.println("Printing b="+b);

    softAssert.assertTrue(a==b,"is a and b same ?");
    }
}
