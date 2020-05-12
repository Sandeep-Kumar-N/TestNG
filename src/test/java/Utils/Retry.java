package Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
    private static final int MAX_ATTEMPTS=3;
    private int currentAttempt = 0;
    public boolean retry(ITestResult iTestResult) {
        currentAttempt++;
        if (currentAttempt <= MAX_ATTEMPTS) {
            return true;
        }
        return false;
    }
}
