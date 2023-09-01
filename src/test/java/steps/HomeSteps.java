package steps;

import core.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class HomeSteps {
	@When("acesso a home do site")
	public static void acessoAHomeDoSite() {
		HomePage.acessarSite();
	}
	
	@When("preencho o campo Nome com valor {string}")
	public static void preenchoOCampoNome(String valor) {
		HomePage.preencherCampoNome(valor);
	}
	
	@Then("verifico o titulo Somos Verity_")
	public static void verificoOTituloSomosVerityv() {
		HomePage.verificarTituloSomosVerity();
	}
	
	@And("verifico o titulo Nossos clientes_")
	public static void verificoOTituloNossosClientes_() {
		HomePage.verificarTituloNossosClientes();
	}
	
	@And("preencho o campo Email com valor {string}")
	public static void preenchoOCampoEmail(String valor) {
		HomePage.preencherCampoEmail(valor);
	}
	
	@And("preencho o campo Telefone com valor {string}")
	public static void preenchoOCampoTelefone(String valor) {
		HomePage.preencherCampoTelefone(valor);
	}
	
	@And("preencho o campo Nos conte o seu desafio com valor {string}")
	public static void preenchoOCampoNosConteOSeuDesafio(String valor) {
		HomePage.preencherCampoNosConteOSeuDesafio(valor);
	}
	
	@And("marco o checkbox Aceito receber mensagens da Verity")
	public static void marcoOCheckboxAceitoReceberMensagensDaVerity() {
		HomePage.marcarCheckboxAceitoReceberMensagensDaVerity();
	}
	
	@And("clico no botao Enviar")
	public static void clicoNoBotaoEnviar() {
		HomePage.clicarBotaoEnviar();
	}
	
	@And("verifico o texto de confirmacao")
	public static void verificoOTextoDeConfirmacao() {
		HomePage.verificarOTextoDeConfirmacao();
	}
	
	@After
	public void fecharBrowser() {
		WebDriverManager.fecharDriver();
	}
}
