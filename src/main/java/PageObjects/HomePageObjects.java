package PageObjects;

public interface HomePageObjects
{
    String secondaryContainer = "header_secondary_container";


    String BackpackXpathName ="(//button[@class='btn_primary btn_inventory'][normalize-space()='ADD TO CART'])[1]";
    String TShirtXpathName ="//div[normalize-space()='Sauce Labs Backpack']";


    String cartButtonClass = "shopping_cart_link";
    String cartbadgeClass =".fa-layers-counter.shopping_cart_badge";

}

