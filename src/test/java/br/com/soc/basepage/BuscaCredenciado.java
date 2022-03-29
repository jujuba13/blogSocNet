package br.com.soc.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BuscaCredenciado {
	private static WebDriver driver;
	
	private By clicaParaPesquisa = By.id("lnk-mostra-opcoes");
	private By areaPesquisa = By.id("btn-distancia-30");
    private By busqueCpOuCidade = By.id("ipt-busca-credenciado-2");
    private By selecionarSaibaMais = By.id("PlacesAutocomplete__suggestion-ChIJ0WGkg4FEzpQRrlsz_whLqZs");
    private By teste = By.cssSelector("div:nth-child(1) > .estrutura-resultados-mapa .truncate");                             
    private By clickMais = By.cssSelector(".btn-alinhado");
    private By textoRede = By.className("titulo-rede-credenciada");
	
    
    public BuscaCredenciado(WebDriver driver) {
		this.driver = driver;
	}
	
    
    
	public void areaPesquisaRaio() {
		driver.findElement(areaPesquisa).click();
		
	}
	
	public void botaoParaAlterarDistanciaKm() {
		driver.findElement(clicaParaPesquisa).click();

	
	}
	
	public void buscarCepOuCidade() {
		driver.findElement(busqueCpOuCidade).sendKeys(Keys.chord("São Paulo"));
		
	}
	
	public void clicarNaOpcaoSaibaMaisDoCredenciadoDesejado() {
        driver.findElement(selecionarSaibaMais).click();
    }
	
	
	
	public void clicarNaOpcaoSaibaMaisDoCredenciadoDesejados() {
        driver.findElement(teste).click();
    }
	
	public void  clickMais() {
		driver.findElement(clickMais).click();
	}
	
	
	public String TextoRedes() {
		return driver.findElement(textoRede).getText();
	}
	}


	
	
	
	

	
	

