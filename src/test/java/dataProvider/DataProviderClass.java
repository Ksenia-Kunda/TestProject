package dataProvider;

import org.testng.annotations.DataProvider;

/**
 * Created by Kseniya_Kunda on 7/17/2017.
 */
public class DataProviderClass {

    @DataProvider
    public static Object[][] testData() {
        return new Object[][]{
                new Object[]{5, 3, 15},
                new Object[]{2, 2, 4},
                new Object[]{6, 8, 48},
                new Object[]{2, 0, 0}
        };
    }
}
