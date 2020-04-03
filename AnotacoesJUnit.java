package aprendendo_selenium;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class AnotacoesJUnit {
	@Test
	public void CasodeTeste1() {
		System.out.println("Comando de Teste!!");	
	}
	@Test
	public void CasodeTeste2() {
		System.out.println("Comando de Teste!!!");	
	}
	@AfterClass
	public static void DepoisdaClasse() {
		System.out.println("-----Finalizando testes!");
	}
	
	@BeforeClass
	public static void AntesdaClasse() {
		System.out.println("-----Iniciando Testes!");
	}
	@After
	public void DepoisdeCadaTeste(){
		System.out.println("***Teste finalizado!");
	}
	@Before
	public void AntesdeCadaTeste(){
		System.out.println("***Teste iniciado!");
	}
	@Test
	public void CasodeTeste() {
		System.out.println("Comando de Teste!");	
	}
}
