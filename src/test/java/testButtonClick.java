import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testButtonClick
        {
        @Test
        public void testButtonClickSelenium() throws Exception
        {
            System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://qa.slimware.slim.local");
//            Thread.sleep(5000);
            WebElement MyAccount = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
            MyAccount.click();
//            Thread.sleep(5000);
            WebElement EmailField = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
            EmailField.sendKeys("automation@diaspark.com");
            WebElement LoginButton = driver.findElement(By.xpath("//button[@class='button--white continue-icon']"));
            LoginButton.click();
//            Thread.sleep(5000);
            WebElement CopyLicenceKey_SCP= driver.findElement(By.xpath("//div[@class='container']//div[1]//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]"));
            CopyLicenceKey_SCP.click();
            Thread.sleep(5000);
            driver.close();
        }
        }