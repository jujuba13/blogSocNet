package br.com.soc.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {
	private static WebDriver driver;
	
	
	private By acessarFuncionalidade = By.xpath("//section[2]/div/div/div/div/div/div[2]/div/nav[1]/ul/li[2]/a[contains(text(),'Funcionalidades')][1]");
	private By RedeSocNet = By.linkText("Rede SOCNET");
	private By modalPaginaInicial = By.id("b033cf8f-2414-426b-a078-7311eb289fa1");
	
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void acessarFuncionalidade() {
		
	
		WebElement clicarFuncionalidade =  driver.findElement(acessarFuncionalidade);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(clicarFuncionalidade));
		
		Actions action = new Actions(driver);
		action.moveToElement(clicarFuncionalidade).perform();
		clicarFuncionalidade.click();  
		
		}
	
	
	public void fucionalidadeDeBuscasCredenciados() {
		driver.findElement(RedeSocNet).click();
		
	}
	 public void modalPaginaIniciaL() {
		 driver.findElement(modalPaginaInicial).click();
		 
	 }
	 

}
	

