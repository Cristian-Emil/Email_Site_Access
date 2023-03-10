package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseEmailPage {

    public ChooseEmailPage(WebDriver driver){ PageFactory.initElements(driver, this);}

//----------------------------------- Facem CLICK pe casuta de INBOX ---------------------------------------------------
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[1]/div/a")
    private static WebElement clickInbox;
    public static WebElement getClickInbox() { return clickInbox;}

//---------------------------------- Facem CLICK pe casuta de UNREAD ---------------------------------------------------

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[2]/a")
    private static WebElement clickUnread;
    public static WebElement getClickUnread() { return clickUnread;}

//---------------------------------- Facem CLICK pe casuta de STARRED ---------------------------------------------------

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[3]/a")
    private static WebElement clickStarred;
    public static WebElement getClickStarred() { return clickStarred;}

//---------------------------------- Facem CLICK pe casuta de DRAFTS ---------------------------------------------------

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[4]/div/a")
    private static WebElement clickDrafts;
    public static WebElement getClickDrafts() { return clickDrafts;}

//----------------------------------- Facem CLICK pe casuta de SENT ----------------------------------------------------

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[5]/div/a")
    private static WebElement clickSent;
    public static WebElement getClickSent() { return clickSent;}

//--------------------------------- Facem CLICK pe casuta de ARCHIVE ---------------------------------------------------

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[6]/div/a")
    private static WebElement clickArchive;
    public static WebElement getClickArchive() { return clickArchive;}

//----------------------------------- Facem CLICK pe casuta de SPAM ----------------------------------------------------

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[7]/div/a")
    private static WebElement clickSpam;
    public static WebElement getClickSpam() { return clickSpam;}

//----------------------------------- Facem CLICK pe casuta de TASH ----------------------------------------------------



}
