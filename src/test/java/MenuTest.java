import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuTest {

    public void searchForChealseaTee(){

        System.setProperty("webrdiver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        WebElement menuList = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li:nth-child(2) > div > h3 > a"));
        menuList.click();
        if(driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-name > span")).getText().equals("CHELSEA TEE\n")){
            System.out.println("Product found");
        }else {
            System.err.println("Product not found");

            driver.close();
        }


        }


    public void povestiCopii(){
        System.setProperty("webrdiver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        WebElement povestiCopii = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-7.active.last > a"));
        povestiCopii.click();
        if(driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.page-title.category-title > h1")).getText().equals("\n" +
                "There are no products matching the selection.")){
            System.out.println("Succes");
        }else {
            System.err.println("Fail");

            driver.close();
        }

        }

    }

