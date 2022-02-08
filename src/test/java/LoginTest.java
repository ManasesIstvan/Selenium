import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public void loginWithValidePass(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        WebElement accountLink = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountLink.click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("GicuGrozav@mailinator.com");
        driver.findElement(By.id("pass")).sendKeys("1234567");
        driver.findElement(By.id("send2")).click();
        if (driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong")).getText().equals("Hello, Gicu Grozav!\n" +
                "\n")){
            System.out.println("Succes");
        } else
            System.err.println("Fail");

        driver.close();
    }

    public void loginWithInValidePass(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        WebElement accountLink = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountLink.click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("GicuGrozav.mailinaor.com");
        driver.findElement(By.id("pass")).sendKeys("1234567");
        driver.findElement(By.id("send2")).click();
        if (driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.account-login > ul > li > ul > li > span")).getText().equals("Invalid login or password.\n")){
            System.out.println("Succes");
        } else
            System.err.println("Fail");

        driver.close();
    }


}
