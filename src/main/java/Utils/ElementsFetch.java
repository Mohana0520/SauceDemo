package Utils;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementsFetch {
    public WebElement getWebElement(String identifierType, String identifierValue){
        switch (identifierType){
            case "XPATH":
                return BaseTest.driver.findElement(By.xpath(identifierValue));
            case "CSS":
                return BaseTest.driver.findElement(By.cssSelector(identifierValue));
            case "ID":
                return BaseTest.driver.findElement(By.id(identifierValue));
            case "CLASSNAME":
                return BaseTest.driver.findElement(By.className(identifierValue));
            case "LINKTEXT":
                return BaseTest.driver.findElement(By.linkText(identifierValue));
            default:
                return null;
        }
    }}





