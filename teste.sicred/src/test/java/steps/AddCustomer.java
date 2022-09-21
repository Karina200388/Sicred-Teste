package steps;





import elementos.Elementos;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import metodos.Metodos;
import runner.Executa;

public class AddCustomer {
    
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	
	
	@Dado("que eu acesso o site")
	public void queEuAcessoOSite() {
		Executa.abrirNavegador();
	}
	
	
	@E("selecione o bootstrap v4")
	public void selecioneOBootstrapV4() {
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
	    metodos.clicar(el.FromEmployeer);
	    metodos.clicar(el.fromEmployeer, "Fixter");
	    metodos.escrever(el.CreditLimit, "200");
	
	
	}

	@Quando("clicar em salvar")
	public void clicarEmSalvar() {
		metodos.clicar(el.save);
	}

	@Entao("validamos a mensagem")
	public void validamosAMensagem() throws InterruptedException {
		metodos.pausa(3000);
		metodos.validarTexto(el.reportSucess, "Your data has been successfully stored into the database.");
	
	    metodos.fecharNavegador("Encerrando o teste");
	}

}
