package qa.tests;

import Base.BaseTest;
import PageEvents.*;
import Utils.ElementsFetch;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Testcase extends BaseTest {
    ElementsFetch element = new ElementsFetch();
    LoginPageEvents loginpage = new LoginPageEvents();
    HomePageEvents homepage = new HomePageEvents();
    CheckOutOverViewPageEvents checkoutoverview = new CheckOutOverViewPageEvents();
    CheckOutInfoPageEvents checkoutinfo = new CheckOutInfoPageEvents();
    CartPageEvents cartpage = new CartPageEvents();

    @Test(priority = 2)
    public void LoginFunctionality(){
        loginpage.login();
        homepage.verifyPageLoaded();
    }
    @Test(priority = 3)
    public void checkNoOfItemsInCart(){
        loginpage.login();

        homepage.addbackpacktocart();
        homepage.tshirttocart();
        Assert.assertEquals(homepage.getCountInCart(), 1);
    }

    @Test(priority = 1)
    public void endToEndFlow(){
        loginpage.login();

        homepage.addbackpacktocart();
        homepage.tshirttocart();


        Assert.assertEquals(homepage.getCountInCart(), 1);

        homepage.clickCart();
        cartpage.clickOnCheckout();

        checkoutinfo.enterreqdetails();
        checkoutoverview.finish();

        String actualMessage = element.getWebElement("CLASSNAME", "complete-header").getText();
        System.out.println(actualMessage);

        Assert.assertEquals(actualMessage, "THANK YOU FOR YOUR ORDER", "Wrong Message Found!!");

    }
}







