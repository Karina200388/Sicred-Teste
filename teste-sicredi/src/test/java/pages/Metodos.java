package pages;

import org.openqa.selenium.By;

public class Metodos extends Browsers {

	public void clicar(By version) {
		driver.findElement(version).click();
	}

	public void escrever(By elemento) {
		driver.findElement(elemento).sendKeys("Teste Sicred");
		
	}

	public void preencher(By elemento) {
     driver.findElement(elemento).sendKeys("Teste");

	}

	
	

}
