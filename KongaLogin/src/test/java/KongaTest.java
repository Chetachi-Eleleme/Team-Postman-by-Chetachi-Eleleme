import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KongaTest {
    //import Selenium webdriver
@Test
    private WebDriver driver;
    public void begin(){
        public void Start() throws InterruptedException {
            //locate webdriver
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            //1) open chrome browser
            driver = new ChromeDriver();
            //2)Visit the URL Konga
            driver.get("https://konga.com");
            Thread.sleep(5000);
            //3)maximize page
            driver.manage().window().maximize();
            //4)  Attempt to login. click on login/signup
            driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
            //4) input Email in emailaddress/phonemun field
            driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("okeowoalaba23@gmail.com");
            //5)input password in password field
            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Halimat003");
            //5)Sign in to Konga Successfully (click login)
            driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
            //6)  click on the "Computers and Accessories"
            driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[2]/div/a[2]"));Thread.sleep(5000);
            Actions actions = new Actions(driver);
            WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[2]/div/a[2]"));
            actions.moveToElement(element).perform();
            Thread.sleep(5000);
            //7) Click on the Laptop SubCategory
            WebElement subElement = driver.findElement(By.xpath("//a[normalize-space()='Laptops']"));
            subElement.click();
            Thread.sleep(5000);
            // select Apple Macbook
            WebElement suElement = driver.findElement(By.xpath("//main[@id='mainContent']/section[@class='_8d917_1ixfS']/section[@class='_58fc0_2UVzP']//section[@class='_7d295_SvW4q']//ul[@class='f0597_2FrP0']//a[@href='/category/laptops-5230?']/ul[@class='_9136e_29Ql8']//span[.='Apple MacBooks']"));
            suElement.click();
            // select Apple Macbook
            WebElement macBook = driver.findElement(By.xpath("//img[@title='Pro With M1 Pro Chip - 1TB HDD - 16GB RAM - 14.2\" - Late 2021 - Space Grey.']"));
            macBook.click();
            //9) Add an item to the cart
            WebElement addCart = driver.findElement(By.xpath("//img[@title='Pro With M1 Pro Chip - 1TB HDD - 16GB RAM - 14.2\" - Late 2021 - Space Grey.']"));
            addCart.click();
            Thread.sleep(5000);
            //10) Select Mycart
            WebElement myCart = driver.findElement(By.xpath("//span[normalize-space()='My Cart']"));
            myCart.click();
            Thread.sleep(5000);
            //11)select checkout
            WebElement checkOut = driver.findElement(By.xpath("//div[contains(@class,'f082d_safAL')]//a[@class='_0a08a_3czMG'][normalize-space()='Continue to Checkout']"));
            checkOut.click();
            //12)Select pay now
            driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[1]/div[1]/span/input")).click();
            // 13)select continue to payment
            driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[3]/div[2]/div/button")).click();
            // 14)select card payment
            driver.findElement(By.xpath("//*[@id=\"channel-template\"]/div[2]/div/div[3]/button")).click();
            //15) input card number
            driver.findElement(By.xpath("//*[@id=\"card-number\"]")).sendKeys("1234567890");
            //16)select paynow
            driver.findElement(By.xpath("//*[@id=\"validateCardForm\"]")).click();
            //17) Print Out the error message: Invalid card number
            // error message=[@id="card-number_unhappy"]
            //18)Close the iFrame that displays the input card Modal
            driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[1]/aside")).click();
     public void exitKonga
            driver.quit();
        }
    }
}

