package page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import core.TiposBrowser;
import core.TiposSeletores;
import core.WebDriverManager;

public class HomePage extends WebDriverManager {
	private static final String url= "https://www.verity.com.br/";
	private static final String xpathTituloSomosVerity= "//h2[text()='Somos Verity']";
	private static final String xpathTituloNossosClientes= "//h2/span[text()='Nossos clientes']";
	private static final String xpathMenuOpcaoContato= "//p[text()='CONTATO']";
	private static final String xpathNewsletterCmpNome= "//input[@name='nome']";
	private static final String xpathNewsletterCmpEmail= "//input[@name='email']";
	private static final String xpathNewsletterCmpTelefone= "//input[@name='phone']";
	private static final String xpathNewsletterCmpNosConteOSeuDesafio= "//textarea[@placeholder='Nos conte o seu desafio']";
	private static final String xpathNewsletterChkAceitoReceberMensagensDaVerity= "//label[@data-testid='checkbox']//input";
	private static final String xpathNewsletterBtnEnviar= "[data-testid='buttonElement']";
	private static final String xpathConfirmacaoObrigado= "//span[text()='Obrigado!']";
	
	public static WebElement tituloSomosVerity;
	public static WebElement tituloNossosClientes;
	public static WebElement menuOpcaoContato;
	public static WebElement newsletterCmpNome;
	public static WebElement newsletterCmpEmail;
	public static WebElement newsletterCmpTelefone;
	public static WebElement newsletterCmpNosConteOSeuDesafio;
	public static WebElement newsletterChkAceitoReceberMensagensDaVerity;
	public static WebElement newsletterBtnEnviar;
	public static WebElement confirmacaoObrigado;
	
	public static void acessarSite() {
		criarDriver(TiposBrowser.Chrome);
		acessarPaginaSite(HomePage.url);
		aguardarUrl(HomePage.url, 3000);
	}
	
	public static void preencherCampoNome(String valor) {
		aguardarPresencaElemeto(TiposSeletores.XPATH, xpathNewsletterCmpNome, 3000);
		newsletterCmpNome= encontrarElemento(TiposSeletores.XPATH, xpathNewsletterCmpNome);
		escreverCampo(newsletterCmpNome, valor);
	}
	
	public static void preencherCampoTelefone(String valor) {
		aguardarPresencaElemeto(TiposSeletores.XPATH, xpathNewsletterCmpTelefone, 3000);
		newsletterCmpTelefone= encontrarElemento(TiposSeletores.XPATH, xpathNewsletterCmpTelefone);
		escreverCampo(newsletterCmpTelefone, valor);
	}
	
	public static void preencherCampoEmail(String valor) {
		aguardarPresencaElemeto(TiposSeletores.XPATH, xpathNewsletterCmpEmail, 3000);
		newsletterCmpEmail= encontrarElemento(TiposSeletores.XPATH, xpathNewsletterCmpEmail);
		escreverCampo(newsletterCmpEmail, valor);
	}
	
	public static void preencherCampoNosConteOSeuDesafio(String valor) {
		aguardarPresencaElemeto(TiposSeletores.XPATH, xpathNewsletterCmpNosConteOSeuDesafio, 3000);
		newsletterCmpNosConteOSeuDesafio= encontrarElemento(TiposSeletores.XPATH, xpathNewsletterCmpNosConteOSeuDesafio);
		escreverCampo(newsletterCmpNosConteOSeuDesafio, valor);
	}
	
	public static void marcarCheckboxAceitoReceberMensagensDaVerity() {
		aguardarPresencaElemeto(TiposSeletores.XPATH, xpathNewsletterChkAceitoReceberMensagensDaVerity, 3000);
		newsletterChkAceitoReceberMensagensDaVerity= encontrarElemento(TiposSeletores.XPATH, xpathNewsletterChkAceitoReceberMensagensDaVerity);
		clicarElemento(newsletterChkAceitoReceberMensagensDaVerity);
	}
	
	public static void clicarBotaoEnviar() {
		aguardarPresencaElemeto(TiposSeletores.XPATH, xpathNewsletterBtnEnviar, 3000);
		newsletterBtnEnviar= encontrarElemento(TiposSeletores.XPATH, xpathNewsletterBtnEnviar);
		aguardarElemetoClicavel(newsletterBtnEnviar, 3000);
		clicarElemento(newsletterBtnEnviar);
	}
	
	public static void verificarTituloSomosVerity() {
		aguardarPresencaElemeto(TiposSeletores.XPATH, xpathTituloSomosVerity, 3000);
		Assert.assertEquals("Somos Verity_".toUpperCase(), tituloSomosVerity.getText().toString().toUpperCase());
	}
	
	public static void verificarTituloNossosClientes() {
		aguardarPresencaElemeto(TiposSeletores.XPATH, xpathTituloNossosClientes, 3000);
		Assert.assertEquals("Nossos clientes_".toUpperCase(), tituloNossosClientes.getText().toString().toUpperCase());
	}
	
	public static void verificarOTextoDeConfirmacao() {
		aguardarPresencaElemeto(TiposSeletores.XPATH, xpathConfirmacaoObrigado, 3000);
		confirmacaoObrigado= encontrarElemento(TiposSeletores.XPATH, xpathConfirmacaoObrigado);
		Assert.assertEquals("Obrigado!".toUpperCase(), confirmacaoObrigado.getText().toString().toUpperCase());
	}
}
