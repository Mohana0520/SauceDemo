package PageEvents;

import PageObjects.HomePageObjects;
import Utils.ElementsFetch;
import org.testng.Assert;

public class HomePageEvents {
    ElementsFetch element = new ElementsFetch();

    public void verifyPageLoaded() {

        Assert.assertTrue(element.getWebElement("CLASSNAME", HomePageObjects.secondaryContainer).isDisplayed(), "element is not found in this case");
    }
    public void addbackpacktocart(){
        element.getWebElement("XPATH", HomePageObjects.BackpackXpathName).click();
    }

    public void tshirttocart(){
        element.getWebElement("XPATH", HomePageObjects.TShirtXpathName).click();
    }

    public void clickCart() {
        element.getWebElement("CLASSNAME", HomePageObjects.cartButtonClass).click();
    }
    public int getCountInCart(){
        String response = element.getWebElement("CSS", HomePageObjects.cartbadgeClass).getText();
        return Integer.parseInt(response);
    }
}




