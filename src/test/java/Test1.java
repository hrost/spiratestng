import org.testng.annotations.Test;

import com.inflectra.spiratest.addons.testnglistener.SpiraTestCase;
import com.inflectra.spiratest.addons.testnglistener.SpiraTestConfiguration;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;

@SpiraTestConfiguration(
        url = "http://localhost/SpiraTest",
        login = "petrov1",
        password = "Qwer1234",
        projectId = 5,
        releaseId = 20,
        testSetId = 8
)
@Test(groups = {"unittest"})
public class Test1 {
    protected int fValue1;
    protected int fValue2;

    public Test1() {
    }

    @BeforeClass
    public void setUp() {
        this.fValue1 = 2;
        this.fValue2 = 3;
    }

    @Test(groups = {"unittest"})
    @SpiraTestCase(testCaseId = 22)
    public void testAdd() {
        double result = (this.fValue1 + this.fValue2);
        AssertJUnit.assertTrue(result == 5);
    }

    @Test(groups = {"unittest"})
    @SpiraTestCase(testCaseId = 23)
    public void testDivideByZero() {
        int zero = 0;
        int result = 8 / zero;
        ++result;
    }
}
