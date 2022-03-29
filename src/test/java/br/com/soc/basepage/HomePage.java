package br.com.soc.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	


	private static WebDriver driver;

	
	private By PesquisaBusca = By
			.cssSelector(".elementor-search-form__container:nth-child(1) > .elementor-search-form__input");
	private By BotaoDaPesquisa = By.cssSelector(".elementor-search-form__submit > .fas");
	private By BotaoBuscarCredenciados = By.linkText("Buscar credenciados");
	
	 private By textoDeBusca = By.className("elementor-post elementor-grid-item post-3163 page type-page status-publish has-post-thumbnail hentry");

	 
	 
	 
	 
	 
	public String obterTituloDaPagina() {
		return driver.getTitle();
	}


 


	

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public MenuPage PesquisaBlog(String texto) {
		driver.findElement(PesquisaBusca).sendKeys(Keys.chord(texto));
		return new MenuPage(driver);
	}

	public void BotaoPesquisaInicial() {
		WebElement clicarNaLupa = driver.findElement(BotaoDaPesquisa);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(clicarNaLupa));
		clicarNaLupa.click();

	}

	public BuscaCredenciado BotaoBuscarCredenciado() {

		WebElement clicarBotaoCredenciado = driver.findElement(BotaoBuscarCredenciados);
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(clicarBotaoCredenciado));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(clicarBotaoCredenciado).perform();
		clicarBotaoCredenciado.click();  
		
		return new BuscaCredenciado(driver);
	}

	
	public String TextodeBuscasDePesquisa() {
	return driver.findElement(textoDeBusca).getText();
	}

	public void carregarPaginaInicial() {
	driver.get("https://ww2.soc.com.br/blog/");
		
	}
	
}

