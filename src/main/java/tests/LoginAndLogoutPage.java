package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.ChooseAccount;
import pageObjects.ChooseEmailPage;
import pageObjects.SignInPage;

import java.util.Set;

import static utils.TestData.ADMIN_PASSWORD;
import static utils.TestData.ADMIN_USERNAME;


public class LoginAndLogoutPage extends BaseTest {

    @Test
    public void testLogInAdminValidCredential() throws InterruptedException {
        driver.manage().window().maximize();

        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        Thread.sleep(1000);
        SignInPage.getSignInAccount().click();
        Thread.sleep(1000);

//------------------------ Maximizam fereastra in care se vede browserul nostru de Chrome ------------------------------

        String parentWindow = driver.getWindowHandle();
        Set <String> windowHandles = driver.getWindowHandles();
        Thread.sleep(1000);

        for (String window: windowHandles){
            if (!window.equals(parentWindow)){
                driver.switchTo().window(window);
                break;
            }
        }

        ChooseAccount chooseAccount = PageFactory.initElements(driver, ChooseAccount.class);
        Thread.sleep(1000);

        ChooseAccount.getUserName().sendKeys(ADMIN_USERNAME);
        Thread.sleep(1500);
        SignInPage.getSignInAccount().click();
        Thread.sleep(1500);

        ChooseAccount.getPassword().sendKeys(ADMIN_PASSWORD);
        Thread.sleep(1500);
        SignInPage.getSignInButton().click();
        Thread.sleep(1500);

        SignInPage.getSignNoButton().click();
        Thread.sleep(1500);

        ChooseEmailPage chooseEmailPage = PageFactory.initElements(driver, ChooseEmailPage.class);
        Thread.sleep(1000);

        ChooseEmailPage.getClickInbox().click();
        Thread.sleep(2000);

        ChooseEmailPage.getClickUnread().click();
        Thread.sleep(2000);

        ChooseEmailPage.getClickStarred().click();
        Thread.sleep(2000);

        ChooseEmailPage.getClickDrafts().click();
        Thread.sleep(2000);

        ChooseEmailPage.getClickSent().click();
        Thread.sleep(2000);

        ChooseEmailPage.getClickArchive().click();
        Thread.sleep(2000);

        ChooseEmailPage.getClickSpam().click();
        Thread.sleep(12000);


        driver.quit();

    }
}
