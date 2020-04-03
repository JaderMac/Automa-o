package aprendendo_selenium;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeirosPassos {
	
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
	public void MeuPrimeiroTeste() {
		System.out.println(driver.getTitle());
		System.out.println( driver.getCurrentUrl() );
	}
	
	@After
	public void FechaTudoeSai() {
		driver.quit();
	}
}
