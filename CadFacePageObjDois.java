package aprendendo_selenium;

import	org.junit.BeforeClass;
import	org.junit.Test;
import	org.openqa.selenium.WebDriver;
import	org.openqa.selenium.chrome.ChromeDriver;

public class CadFacePageObjDois {
	
	private static	CadFacePageObject	facebook;
	private static	WebDriver	driver;
	
	@BeforeClass
	public static void preCondicao () { 
		System.setProperty("webdriver.chrome.driver", "D:\\Documentos\\Programação\\"
				+ "Selenium com Java\\Baixados\\ChrommeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		facebook = new CadFacePageObject(driver);	
	}
	
    @Test
    public void preencheNomeSobrenome() {
        facebook.preencheNome("José");
        facebook.preencheSobrenome("da Silva");
        facebook.preencheTelefone("129820218989");
        facebook.preencheNovaSenha("112233445566**@@");
        facebook.preencheSexoM();
        facebook.preencheDia("19");
        facebook.preencheMes("Out");
        facebook.preencheAno("1991");
        facebook.clicaBotaoCadastrar();
    }
}
