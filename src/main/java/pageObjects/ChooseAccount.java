package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseAccount {

    public ChooseAccount(WebDriver driver) { PageFactory.initElements(driver, this) ; }

//-------------- Definim elementele din pagina de "SIGN IN" a countului pentru a avea acces in ea ----------------------

    @FindBy ( xpath="//*[@id=\"i0116\"]" )
    private static WebElement userName;
    public static WebElement getUserName() { return userName; }

//-------------- Definim elementele din pagina de "PASSWORD" a countului pentru a avea acces in ea ---------------------

    @FindBy ( xpath="//*[@id=\"i0118\"]" )
    private static WebElement password;
    public static WebElement getPassword() { return password; }


//----------------------------------------------------------------------------------------------------------------------

}
