import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) {
        /* dlwa2ty ana msh menzla webdriver 3ndi 3shan yt3milo fa ana 3shan ash8lo hagkhoud object meno wa a2olo sh8lholy 3la edgedriver l hwa l browser */
        WebDriver driver = new EdgeDriver();
        /* hena ba2olo yft7ly google mn edge browser wa fel str l t7te yt2fl */
        driver.get("https://www.google.com");
        driver.quit();

    }
}
