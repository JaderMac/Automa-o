package aprendendo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CadFacePageObject {

    WebDriver driver;

    public CadFacePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public CadFacePageObject preencheNome(String nome) {
        driver.findElement(By.name("firstname")).sendKeys(nome);
        return this;
    }

    public CadFacePageObject preencheSobrenome(String sobrenome) {
        driver.findElement(By.name("lastname")).sendKeys(sobrenome);
        return this;
    }
    
    public CadFacePageObject preencheUsuario(String usu) {
    	driver.findElement(By.id("email")).sendKeys(usu);
    	return this;
    }
    
    public CadFacePageObject preencheSenha(String senha) {
    	driver.findElement(By.id("pass")).sendKeys(senha);
    	return this;
    }
    
    public CadFacePageObject preencheTelefone (String telefone) {
    	driver.findElement(By.name("reg_email__")).sendKeys(telefone);
    	return this;
    }
    
    public CadFacePageObject preencheNovaSenha (String NovaSenha) {
    	driver.findElement(By.id("u_0_w")).sendKeys(NovaSenha);
    	return this;
    }
       
    public CadFacePageObject preencheDia(String dia) {
    	WebElement comboDia = driver.findElement(By.id("day"));
		Select select = new Select(comboDia);
		select.selectByVisibleText(dia);
		return this;
    }
    
    public CadFacePageObject preencheMes(String Mes) {
    	WebElement comboMes = driver.findElement(By.id("month"));
    	Select select = new Select(comboMes);
		select.selectByVisibleText(Mes);
		return this;
    }
    
    public CadFacePageObject preencheAno (String Ano) {
    	WebElement comboAno = driver.findElement(By.id("year"));
    	Select select = new Select(comboAno);
		select.selectByVisibleText(Ano);
		return this;
    }
    
    public CadFacePageObject preencheSexoM () {
    	driver.findElement(By.id("u_0_7")).click();
    	return this;
     }
    
    public void clicaBotaoCadastrar() {
    	driver.findElement(By.id("u_0_13")).click();
    } 
    
    public void clicaBotaoEntrar() {
    	driver.findElement(By.id("u_0_b")).click();
    }  
    
    public void logarComo(String user, String pass) {
    	preencheUsuario(user).preencheSenha(pass).clicaBotaoEntrar();
    }
}
	