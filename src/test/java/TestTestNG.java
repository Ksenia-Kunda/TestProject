import org.testng.annotations.Listeners;
import utils.DataProviderClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.MyListener;

/**
 * Created by Kseniya_Kunda on 7/17/2017.
 */
@Listeners({ MyListener.class})
public class TestTestNG {

    @Test
    public void test1 () {
        Assert.assertEquals("Hello", "Hello");
    }

    @Test(dependsOnMethods = { "test1" })
    public void test2 () {
        Assert.assertTrue(5>3, "Not true");
    }

    @Test(dependsOnMethods = { "test2" })
    public void test3 () {
        Assert.assertTrue(2==2, "Not true");
    }

    @Test(dataProviderClass = DataProviderClass.class, dataProvider = "testData")
    public void testWithDataProvider(int a, int b, int expected) {
        int result = a*b;
        Assert.assertTrue(result == expected);
    }

    @Parameters({ "URL" })
    @Test
    public void testWithParameter(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(url);
        Assert.assertEquals("Белорусский портал TUT.BY", webDriver.getTitle());

        webDriver.close();
    }
}
