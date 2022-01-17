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
                    softAssert.assertTrue(Driver.getDriver().getTitle().equals(ConfigReader.getProperty("teslaStitle")));

                teslaPages.Model3.click();
                    softAssert.assertTrue(Driver.getDriver().getTitle().equals(ConfigReader.getProperty("tesla3title")));

                teslaPages.ModelX.click();
                    softAssert.assertTrue(Driver.getDriver().getTitle().equals(ConfigReader.getProperty("teslaXtitle")));

                teslaPages.ModelY.click();
                    softAssert.assertTrue(Driver.getDriver().getTitle().equals(ConfigReader.getProperty("teslaYtitle")));

                teslaPages.SolarRoof.click();
                    softAssert.assertTrue(Driver.getDriver().getTitle().equals(ConfigReader.getProperty("teslaSolarRoofTitle")));

                teslaPages.SolarPanels.click();
                    softAssert.assertTrue(Driver.getDriver().getTitle().equals(ConfigReader.getProperty("teslaSolarRoofPanels")));

            softAssert.assertAll();
            Driver.closeDriver();
    }
}
