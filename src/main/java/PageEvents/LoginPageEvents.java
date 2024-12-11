package PageEvents;

import Base.BaseTest;
import PageObjects.LoginPageObjects;
import Utils.ElementsFetch;

public class LoginPageEvents extends BaseTest
{
ElementsFetch element = new ElementsFetch();
 public void login(){
     element.getWebElement("ID",LoginPageObjects.UserNameID).sendKeys("standard_user");
     element.getWebElement("ID",LoginPageObjects.PasswordID).sendKeys("secret_sauce");
     element.getWebElement("ID",LoginPageObjects.loginID).click();

 }
}
