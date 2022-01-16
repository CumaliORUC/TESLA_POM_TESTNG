package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TeslaPages;
import utulities.ConfigReader;
import utulities.Driver;

public class Tesla_HeadersTest {

    @Test
        public void tesla_Headers() {
            TeslaPages teslaPages=new TeslaPages();
            Driver.getDriver().get(ConfigReader.getProperty("tesla_url"));
            SoftAssert softAssert=new SoftAssert();

                teslaPages.ModelS.click();
                    softAssert.assertTrue(ConfigReader.getProperty("teslaStitle").equals("https://www.tesla.com/models"));
                teslaPages.Model3.click();
                    softAssert.assertTrue(ConfigReader.getProperty("tesla3title").equals("https://www.tesla.com/model3"));
                teslaPages.ModelX.click();
                    softAssert.assertTrue(ConfigReader.getProperty("teslaXtitle").equals("https://www.tesla.com/modelx"));
                teslaPages.ModelY.click();
                    softAssert.assertTrue(ConfigReader.getProperty("teslaYtitle").equals("https://www.tesla.com/modely"));
                teslaPages.SolarRoof.click();
                    softAssert.assertTrue(ConfigReader.getProperty("teslaSolarRoofTitle").equals("https://www.tesla.com/solarroof"));
                teslaPages.SolarPanels.click();
                    softAssert.assertTrue(ConfigReader.getProperty("teslaSolarRoofPanels").equals("https://www.tesla.com/solarpanels"));

            softAssert.assertAll();
            Driver.closeDriver();
    }
}
