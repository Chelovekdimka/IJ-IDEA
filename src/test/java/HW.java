import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW {

    public static WebDriver driver;

    @Test
    public void Login() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dddi\\Downloads\\chrome\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://users.bugred.ru/");
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("tatuaj.romanyuk@gmail.com");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("112233");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input")).click();

        Thread.sleep(200);

        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/ul/li[1]/a")).click();
        WebElement UploadImg = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[1]/td[2]/input"));
        UploadImg.sendKeys("D:\\QA\\avatar1.jpg");

        Select drpname = new Select(driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[3]/td[2]/select")));
        drpname.getOptions();
        drpname.getFirstSelectedOption();
        drpname.selectByIndex(1);

        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("name1");


        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("05.08.1986");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[5]/td[2]/input")).sendKeys("12.09.2017");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[6]/td[2]/textarea")).sendKeys("путешествия, плавание");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("321456987");
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/form/table/tbody/tr[8]/td[2]/input")).click();


        driver.quit();
    }}
