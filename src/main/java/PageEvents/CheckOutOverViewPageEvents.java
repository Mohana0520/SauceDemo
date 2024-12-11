package PageEvents;

import PageObjects.CheckOutOverViewPageElements;
import Utils.ElementsFetch;

public class CheckOutOverViewPageEvents
{
    private static String finishClassName;
    ElementsFetch element = new ElementsFetch();
    public void finish() {
        element.getWebElement("LINKTEXT", CheckOutOverViewPageElements.finishlinktext).click();
    }
}


