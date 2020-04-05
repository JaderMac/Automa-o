package aprendendo_selenium;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locadores {
		
		WebDriver driver;
		
		@Before
		public void PreCondicao() {
			System.setProperty("webdriver.chrome.driver", "D:\\Documentos\\Programação\\"
							+ "Selenium com Java\\Baixados\\ChrommeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.google.com.br");
			driver.manage().window().maximize();	
		}
		
		@Test
		public void PesquisaNoGoogle() {
			WebElement CaixaPesquisa = driver.findElement(By.name("q"));
			// Utilizando outros locadores
			// WebElement CaixaPesquisa = driver.findElement(By.cssSelector("#q")); 
			// WebElement CaixaPesquisa = driver.findElement(By.xpath("//*[@id='q']"));	
			CaixaPesquisa.clear();
			CaixaPesquisa.sendKeys("Teste");
			CaixaPesquisa.submit();
			// Tentei utilizar Botão e Click, mas deu erro! - Ver depois 
			//WebElement BtnPesquisar = driver.findElement(By.name("btnK"));
			//BtnPesquisar.click(); // Element Not Interactable Exception
		}
		
		@After
		public void FechaTudoeSai() {
			driver.quit();
		}
}
