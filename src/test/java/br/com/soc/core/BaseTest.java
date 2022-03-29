package br.com.soc.core;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.soc.basepage.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
		private static WebDriver driver;
		
		protected HomePage homePage;
		
		@BeforeAll
		
		public static void inicializar() {
			//System.setProperty("webdriver.chrome.driver", "C:\\WEBDRIVERS\\ChromeDriver\\99\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.navigate().refresh();
			
			driver.manage().window().maximize();
		}
	 
		@BeforeEach
		
	        public void carregarPaginaInicial() {
			driver.get("https://ww2.soc.com.br/blog/");
			homePage = new HomePage(driver);
			
		}
		@AfterAll
		
		public static void finalizar() {
			//driver.quit();
	
		}
		

		
		
}
