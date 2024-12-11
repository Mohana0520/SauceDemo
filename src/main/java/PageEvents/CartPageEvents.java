package PageEvents;

import PageObjects.CartPageElements;
import Utils.ElementsFetch;

public class CartPageEvents {
    ElementsFetch element = new ElementsFetch();

    public void clickOnCheckout() {
        element.getWebElement("LINKTEXT", CartPageElements.checkoutLinkName).click();
    }
}
