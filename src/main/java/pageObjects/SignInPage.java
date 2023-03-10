package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage(WebDriver driver) { PageFactory.initElements(driver, this); }


//---------- Definim elementul buton de acces "SIGN IN" din pagina de OUTLOOK pentru a avea acces in cont --------------
    @FindBy( xpath="/html/body/header/div/aside/div/nav/ul/li[2]/a" )
    private static WebElement signInAccount;
    public static WebElement getSignInAccount() { return signInAccount; }

//---------- Definim elementul buton de acces "NEXT" din pagina countului pentru a avea acces mai departe --------------
    @FindBy( xpath="//*[@id=\"idSIButton9\"]" )
    private static WebElement nextButton;
    public static WebElement getNextButton() { return nextButton; }

//--------- Definim elementul buton de acces "SIGN IN" din pagina countului pentru a avea acces mai departe ------------

    @FindBy ( xpath="//*[@id=\"idSIButton9\"]" )
    private static WebElement signInButton;
    public static WebElement getSignInButton() { return signInButton; }

//---------- Definim elementul buton de acces "NO" din pagina countului pentru a avea acces mai departe ----------------

    @FindBy ( xpath="//*[@id=\"idBtn_Back\"]" )
    private static WebElement signNoButton;
    public static WebElement getSignNoButton() { return signNoButton; }

//---------- Definim elementul buton de acces "NO" din pagina countului pentru a avea acces mai departe ----------------



}
