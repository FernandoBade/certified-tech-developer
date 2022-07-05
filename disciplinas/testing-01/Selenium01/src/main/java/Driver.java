import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Driver {

    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        WebElement campoUsuario = driver.findElement(By.id("user-name"));
        campoUsuario.sendKeys("standard_user");
        WebElement campoSenha = driver.findElement(By.id("password"));
        campoSenha.sendKeys("secret_sauce");
        WebElement botaoLogin = driver.findElement(By.className("btn_action"));
        botaoLogin.click();
        WebElement botaoAdd = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        botaoAdd.click();
        WebElement cliqueCarrinho = driver.findElement(By.className("shopping_cart_link"));
        cliqueCarrinho.click();
        WebElement cliqueCheckout = driver.findElement(By.id("checkout"));
        cliqueCheckout.click();
        WebElement campoNome = driver.findElement(By.id("first-name"));
        campoNome.sendKeys("Fernando");
        WebElement campoSobrenome = driver.findElement(By.id("last-name"));
        campoSobrenome.sendKeys("Bade");
        WebElement campoCEP = driver.findElement(By.id("postal-code"));
        campoCEP.sendKeys("12345-678");
        WebElement btnContinue = driver.findElement(By.id("continue"));
        btnContinue.click();
        WebElement btnFinish = driver.findElement(By.id("finish"));
        btnFinish.click();


    }
}
