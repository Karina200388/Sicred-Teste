package steps;

import elementos.Elementos;
import io.cucumber.java.Before;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import metodos.Metodos;
import runner.Executa;

public class AddCustomer {
    
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
	}
	
	@Dado("que selecione o bootstrap v4")
	public void queSelecioneOBootstrapV4() {
		metodos.clicar(el.version);
	}

	@E("clico em adicionar cliente")
	public void clicoEmAdicionarCliente() {
		metodos.clicar(el.addCustomer);
	    
	}

	@E("preencho os dados")
	public void preenchoOsDados() {
		metodos.escrever(el.name, "Teste Sicred");
	    metodos.escrever(el.lastName, "teste");
	    metodos.escrever(el.ContactFirstName, "Karina Araujo");
	    metodos.escrever(el.phone, "51 9999-9999");
	    metodos.escrever(el.AddressLine1, "Av Assis Brasil, 3970");
	    metodos.escrever(el.AddressLine2, "Torre D");
	    metodos.escrever(el.City, "Porto Alegre");
	    metodos.escrever(el.State, "RS");
	    metodos.escrever(el.PostalCode, "91000-000");
	    metodos.escrever(el.Country, "Brasil");
	    metodos.clicar(el.fromEmployeer, "Fixter");
	    metodos.escrever(el.CreditLimit, "200");
	
	
	}

	@Quando("clicar em salvar")
	public void clicarEmSalvar() {
		metodos.clicar(el.save);
	}

	@Entao("validamos a mensagem")
	public void validamosAMensagem() {
		metodos.validarTexto(el.reportSucess, "Your data has been successfully stored into the database. Edit Customer or Go back to list");
	}

}
