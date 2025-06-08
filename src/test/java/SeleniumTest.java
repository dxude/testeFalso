import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration; 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class SeleniumTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void helloSeleniumTest() {
        driver.get("https://www.globo.com/");
        String currentUrl = driver.getCurrentUrl();
        assertEquals("https://www.globo.com/", currentUrl);
    }
    
    @Test
    public void test1() {
        driver.get("https://www.google.com/");
        String pageTitle = driver.getTitle();
        assertEquals("Google", pageTitle);
    }

    @Test
    public void test2() {
        driver.get("https://pt.wikipedia.org/");
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.click();
        
        WebElement activeElement = driver.switchTo().activeElement();
        assertEquals(searchInput, activeElement);
    }

    @Test
    public void test3() {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            driver.manage().window().maximize();
            driver.get("https://www.globo.com");

            // Espera o botão de lupa estar presente e força o clique com JavaScript (caso seja encoberto)
            WebElement searchButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("header-search-button")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchButton);

            // Espera o campo de input aparecer e digita a busca
            WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("header-search-input")));
            searchInput.sendKeys("notícias de hoje");

            // Pressiona ENTER para iniciar a busca
            searchInput.sendKeys(Keys.ENTER);

            // Aguarda algum tempo para visualizar os resultados (opcional)
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test
public void test4() {
    driver.get("https://www.globo.com/");

    try {
        WebDriverWait waitCookies = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cookieButton = waitCookies.until(ExpectedConditions.elementToBeClickable(By.id("lgpd-accept")));
        cookieButton.click();
        System.out.println("Banner de cookies aceito com sucesso.");
    } catch (Exception e) {
        System.out.println("Banner de cookies não encontrado ou já aceito.");
    }

    System.out.println("--- INICIANDO MODO DETETIVE PARA O TESTE 4 ---");

    try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }


    java.util.List<WebElement> g1Menus = driver.findElements(By.cssSelector("a[href*='g1.globo.com']"));

    System.out.println("Número de elementos 'g1' encontrados: " + g1Menus.size());

    int counter = 1;
    for (WebElement menu : g1Menus) {
        System.out.println("--- Elemento " + counter + " ---");
        System.out.println("Texto do elemento: '" + menu.getText() + "'");
        System.out.println("Está visível (isDisplayed)? " + menu.isDisplayed());
        System.out.println("Está habilitado (isEnabled)? " + menu.isEnabled());
        System.out.println("--------------------");
        counter++;
    }

    System.out.println("--- FIM DO MODO DETETIVE ---");

	}
}