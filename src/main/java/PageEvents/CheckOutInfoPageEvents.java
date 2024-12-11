package PageEvents;

import PageObjects.CheckOutInfoPageElements;
import Utils.ElementsFetch;

public class CheckOutInfoPageEvents
{
    //private static String continueClassName;
    ElementsFetch element = new ElementsFetch();

    public void enterreqdetails(){
        element.getWebElement("ID", CheckOutInfoPageElements.firstnameID).sendKeys("Priya");
        element.getWebElement("ID", CheckOutInfoPageElements.lastnameID).sendKeys("G");
        element.getWebElement("ID", CheckOutInfoPageElements.zipcodeID).sendKeys("44035");
        element.getWebElement("CSS",CheckOutInfoPageElements.continueClassName).click();

    }
}
