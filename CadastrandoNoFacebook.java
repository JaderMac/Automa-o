package aprendendo_selenium;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CadastrandoNoFacebook {
	
	WebDriver driver;
	
	@Before
	public void AbreNavegadorESite() {
		System.setProperty("webdriver.chrome.driver", "D:\\Documentos\\Programação\\"
						+ "Selenium com Java\\Baixados\\ChrommeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();	
	}
	@After
	public void FechaNavegador() {
		driver.close();
	}
	@Test
	public void PreencheCampos() throws InterruptedException {
		WebElement Nome = driver.findElement(By.id("u_0_m"));
		WebElement SobreNome = driver.findElement(By.id("u_0_o"));
		WebElement Celular = driver.findElement(By.id("u_0_r"));
		WebElement Senha = driver.findElement(By.name("reg_passwd__"));
		
		Nome.sendKeys("Jader");
		SobreNome.sendKeys("Machado");
		Celular.sendKeys("1298000000");
		Senha.sendKeys("123456");
		
		WebElement comboDia = driver.findElement(By.id("day"));
		Select select = new Select(comboDia);
		select.selectByVisibleText("15");
		
		WebElement comboMes = driver.findElement(By.id("month"));
		select = new Select(comboMes);
		select.selectByVisibleText("Jun");
		
		WebElement comboAno = driver.findElement(By.id("year"));
		select = new Select(comboAno);
		select.selectByVisibleText("1980");
		
		driver.findElement(By.id("u_0_7")).click();
		driver.findElement(By.name("websubmit")).click();
	}
	
}
