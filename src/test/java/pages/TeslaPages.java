package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class TeslaPages {
    public TeslaPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
        @FindBy (linkText = "Model S")
            public WebElement ModelS;

        @FindBy (linkText = "Model 3")
            public WebElement Model3;

        @FindBy (linkText = "Model X")
            public WebElement ModelX;

        @FindBy (linkText = "Model Y")
            public WebElement ModelY;

        @FindBy (linkText = "Solar Roof")
            public WebElement SolarRoof;

        @FindBy (linkText = "Solar Panels")
            public WebElement SolarPanels;

}
