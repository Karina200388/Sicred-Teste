package metodos;


import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import conexoes.DriversFactory;

public class Metodos extends DriversFactory {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}
	public void clicar(By FromEmployeer, String texto) {
		driver.findElement(FromEmployeer).click();
	
	}
	

	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEsperado));

	}

	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
	
	
	public void fecharNavegador(String texto) {
		driver.quit();
		
	}

	

}

