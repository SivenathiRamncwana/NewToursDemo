import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sramncwana\\IdeaProjects\\NewToursDemo\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String Test_Results="";

        driver.get("http://demo.guru99.com/test/newtours/");

        driver.findElement(By.xpath("//a[contains(.,'REGISTER')]")).click();

        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Sivenathi");

        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Ramncwana");

        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("0835079843");

        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("siveramncwana@gmailcom");

        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("55 Pioneer street");

        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Cape Town");

        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Western Cape");

        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("7441");

        Select drpCountry = new Select(driver.findElement(By.name("country")));

        drpCountry.selectByVisibleText("SOUTH AFRICA");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("siveramncwana@gmailcom");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Assessment1");

        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Assessment1");

        driver.findElement(By.xpath("//input[@name='submit']")).click();

        if(driver.getPageSource().contains("Thank you for registering. You may now sign-in using the user name and password "));
        {
            Test_Results = "PASSED";
        } else
            Test_Results = "FAILED";


    }
}