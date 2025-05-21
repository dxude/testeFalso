import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class SeleniumTest {
	
    @Test
    public void helloSeleniumTest(){
        //PASSO 1 - Adicionar o driver da versão do seu browser na pasta driver
		// 			e setar o driver com o comando a seguir.
		//			Cada browser tem seu driver.
		//			O chromedriver deve estar na pasta driver e deve ser correspondente
		//			a versão atual seu chrome para o seu SO. No link abaixo,
		//			baixe a versão **Stable**.
		// 			Para baixar seu driver, acessar: https://googlechromelabs.github.io/chrome-for-testing/
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		//PASSO OPCIONAL - Dependendo do SO, tem que explicitar o argumento abaixo
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);

		//Passo 2 - Através do driver, acessar o site desejado
		driver.get("https://www.globo.com/");
		
		// Passo 3 - Extrair da janela aberta a informação obtida
		String currentUrl = driver.getCurrentUrl();
		
		// Passo 4 - Setar o objeto/variável que guardará o valor esperado
		String expected = "https://www.globo.com/";
		
		// Passo 5 - Fazer o assert
		assertEquals(expected, currentUrl);
		
		// Passo 6 - Desligar o driver
		driver.quit();
    }

	// Escreva um script para abrir google.com e verifique se o título é Google
	@Test
	public void test1(){
		
	}

	// Escreva um script para abrir a https://pt.wikipedia.org e procure algum
	// elemento via ID e clique nele
	@Test
	public void test2(){
		
	}

	// Abra o site do globo.com, procure no html, o elemento da barra de pesquisa, 
	// envie uma string "fantastico" e submeta a busca
	@Test
	public void test3(){
		
	}

	// Abra o site do globo.com, procure por algum elemento responsivo ao hover do mouse.
	// utilize o actions para mover o mouse (sem clicar) para este elemento
	@Test
	public void test4(){
		
	}


}
