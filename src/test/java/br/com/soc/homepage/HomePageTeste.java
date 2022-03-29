package br.com.soc.homepage;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import br.com.soc.basepage.BuscaCredenciado;
import br.com.soc.basepage.MenuPage;
import br.com.soc.core.BaseTest;

public class HomePageTeste extends BaseTest {

	@Test

	public void testRealizarUmaPesquisa_BuscarNoBlog() {

		homePage.PesquisaBlog("credenciador");
		homePage.BotaoPesquisaInicial();
assertThat(homePage.TextodeBuscasDePesquisa(), is ("Credenciador"));
	}

	MenuPage menuPage;

	@Test

	public void testFuncionalidades_BucarCredenciado() {

		menuPage = homePage.PesquisaBlog("");
		menuPage.acessarFuncionalidade();

		menuPage.fucionalidadeDeBuscasCredenciados();
        menuPage.modalPaginaIniciaL();

	}

	BuscaCredenciado buscaCredenciado;

	@Test

	public void testBuscasCredenciados() {

		// pré requesito

		testFuncionalidades_BucarCredenciado();
		buscaCredenciado = homePage.BotaoBuscarCredenciado();
		buscaCredenciado.botaoParaAlterarDistanciaKm();
		buscaCredenciado.areaPesquisaRaio();
		buscaCredenciado.buscarCepOuCidade();
		buscaCredenciado.clicarNaOpcaoSaibaMaisDoCredenciadoDesejado();
		buscaCredenciado.clicarNaOpcaoSaibaMaisDoCredenciadoDesejados();
		assertThat(buscaCredenciado.TextoRedes(), is ("Rede Credenciada SOCNET"));
				
		buscaCredenciado.clickMais();
		
	
	}

}
