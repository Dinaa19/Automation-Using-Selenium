import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuite {
    EdgeDriver driver;

    @BeforeTest
    public void OpenBrowser() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void Register() {
        WebElement Register = driver.findElement(By.className("ico-register"));
        Register.click();
        WebElement female = driver.findElement(By.id("gender-female"));
        female.click();
        WebElement firstname = driver.findElement(By.id("FirstName"));
        firstname.sendKeys("Dina");
        WebElement lastname = driver.findElement(By.id("LastName"));
        lastname.sendKeys("ElRefaai");

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        Select select1 = new Select(day);
        select1.selectByValue("19");
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        Select select2 = new Select(month);
        select2.selectByValue("5");
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
        Select select3 = new Select(year);
        select3.selectByValue("2001");

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("dina_elrefaai@hotmail.com");

        WebElement company = driver.findElement(By.id("Company"));
        company.sendKeys("PCS");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Dinaashraf195$$");

        WebElement Cpassword = driver.findElement(By.id("ConfirmPassword"));
        Cpassword.sendKeys("Dinaashraf195$$");

        WebElement rbottom = driver.findElement(By.id("register-button"));
        rbottom.click();
    }

    @Test
    public void Login() {
        WebElement login = driver.findElement(By.className("ico-login"));
        login.click();

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("dina_elrefaai@hotmail.com");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Dinaashraf195$$");

        WebElement rememberme = driver.findElement(By.id("RememberMe"));
        rememberme.click();

        WebElement loginBottom = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
        loginBottom.click();
    }

    @Test
    public void ResetPassword() {

        WebElement forgotme = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[3]/span/a"));
        forgotme.click();

        WebElement emailrec = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        emailrec.sendKeys("dina_elrefaai@hotmail.com");

        WebElement recover = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button"));
        recover.click();

    }

    @Test
    public void Logout() {
        WebElement logout = driver.findElement(By.className("ico-logout"));
        logout.click();
    }

    @Test
    public void searchProduct(String searchType, String searchValue) {

        WebElement searchInput = driver.findElement(By.id("small-search-box-form"));
        searchInput.submit();
    }

    @Test
    public boolean SwitchCurrency(WebDriver driver) {
        WebElement logged = driver.findElement(By.className("ico-logout"));
        boolean isLogged = logged.isEnabled();

        if (isLogged) {
            WebElement currency = driver.findElement(By.id("customerCurrency"));
            Select select1 = new Select(currency);
            select1.selectByValue("Euro");
            return true;
        } else {
            System.out.println("User not logged, Forbidden process");
            return false;
        }
    }
}



