package steps;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.soc.basepage.BuscaCredenciado;
import br.com.soc.basepage.HomePage;
import br.com.soc.basepage.MenuPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AcessoSteps {
	private static WebDriver driver;
	private HomePage homePage = new HomePage(driver);
	private MenuPage menuPage = new MenuPage(driver);
	private BuscaCredenciado  buscaCredenciado= new BuscaCredenciado(driver);
	
@Before
	public static void inicializar() {
		//System.setProperty("webdriver.chrome.driver", "C:\\WEBDRIVERS\\ChromeDriver\\99\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
	}
	
	
	
	@Given("a busca do carregamento da pagina no blog")
	
	public void a_Busca_Do_Carregamento_Da_Pagina() {
	homePage.carregarPaginaInicial();
		assertThat(homePage.obterTituloDaPagina(), is("Blog de SST"));
		
	}
	
	 @When ("eu faco a busca na pesquisa")
	public void eu_faco_a_busca_na_pesquisa() {
		 homePage.PesquisaBlog("Buscar credenciado");
		 
	 }
	 
	 
	 @Then ("eu clico no botao pesquisa,abrirar uma outra pagina")
   public void eu_clico_no_botao_pesquisa_abrirar_uma_outra_pagina() {
		 homePage.BotaoPesquisaInicial();
		 
	 }
	
	
		
	 // cenário de busca credenciados
	 
	 @Given ("ao acessar funcionalidades,clica na RedeSocNet e fecha modal")
	 public void ao_acessar_funcionalidades_clica_na_RedeSocNet_e_fecha_modal() {
		 
		 
		    menuPage = homePage.PesquisaBlog("");
			menuPage.acessarFuncionalidade();

			menuPage.fucionalidadeDeBuscasCredenciados();
	        menuPage.modalPaginaIniciaL();
		 
	 }
	 
	 
	 @When ("abrir a pagina clica no botao buscar crdenciados")
	 public void abrir_a_pagina_clica_no_botao_buscar_crdenciados() {
		
			buscaCredenciado = homePage.BotaoBuscarCredenciado();
	 }
	 
	 @Then ("abrir uma pagina para nova buscas")
	 public void abrir_uma_pagina_para_nova_buscas() {
		 buscaCredenciado.botaoParaAlterarDistanciaKm();
			buscaCredenciado.areaPesquisaRaio();
			buscaCredenciado.buscarCepOuCidade();
			buscaCredenciado.clicarNaOpcaoSaibaMaisDoCredenciadoDesejado();
			buscaCredenciado.clicarNaOpcaoSaibaMaisDoCredenciadoDesejados();
			assertThat(buscaCredenciado.TextoRedes(), is ("Rede Credenciada SOCNET"));
					
			buscaCredenciado.clickMais();
		 
	 }
	 
	 @After
	 public static void finalizar() {
			driver.quit();
	 
}
