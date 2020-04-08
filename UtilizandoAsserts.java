package aprendendo_selenium;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilizandoAsserts {
	
	WebDriver driver;
	
	@Before
	public void PreparaDriverAbreNavegador() {
		System.setProperty("webdriver.chrome.driver", "D:\\Documentos\\Programa��o\\"
				+ "Selenium com Java\\Baixados\\ChrommeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@After
	public void FechaNavegador() {
		driver.close();
	}
	
	@Test // Inserindo a valida��o como argumento.
	public void TestePositivoUrl() {
		String Endere�oAtual = driver.getCurrentUrl();
		Endere�oAtual.equals("Google");
		Assert.assertTrue(Endere�oAtual.equals("https://www.google.com/"));
	}
	
	@Test // Inserindo a variavel como argumento.
	public void TestePositivoTilulo() {
		String TituloAtual = driver.getTitle();
		boolean tituloCorreto = TituloAtual.equals("Google");
		Assert.assertTrue(tituloCorreto);
	}
	
	@Test // Inserindo mensagem de erro 
	public void TesteFalsoTilulo() {
		String TituloAtual = driver.getTitle();
		boolean tituloCorreto = TituloAtual.equals("Gooogle");
		Assert.assertFalse("Titulo do google ta errado!",tituloCorreto);
	}
	
	@Test // Validando se est� igual utilizando o assertEquals
	public void TiluloIgualVariavel() {
		String Variavel = "Google";
		String TituloAtual = driver.getTitle();
		Assert.assertEquals( "Titulo diferente", Variavel, TituloAtual);
	}
}
