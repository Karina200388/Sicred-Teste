package steps;

import elementos.Elementos;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class AddCustomer {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	
	@Given("que eu entre no site da grocerycrud {string}")
	public void que_eu_entre_no_site_da_grocerycrud(String site) {
		metodos.abrirNavegador(site);

	}

	@And("selecione o bootstrap v4")
	public void selecione_o_bootstrap_v4() {
     metodos.clicar(el.version);

	}

	@And("clico em add customer")
	public void clico_em_add_customer() {
    metodos.clicar(el.addCustomer);

	}

	@And("preencho os dados do formulario")
	public void preencho_os_dados_do_formulario() {
    metodos.escrever(el.name);
    metodos.escrever(el.lastName);
	metodos.escrever(el.contactFirstName);
	
	
	}

	@When("clicar em salvar")
	public void clicar_em_salvar() {


	}

	@Then("validamos a mensagem")
	public void validamos_a_mensagem() {




	}
}
