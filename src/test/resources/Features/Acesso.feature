Feature: Pagina Soc
 Como eu estou realizando um teste
 Eu quero acessar o site soc 
 Para iniciar ao pagina ir até o icone da funcionalidade, rede socnet,credenciado para preeencher o formulario 
  
  @Validacaoinicial
  Scenario: busca no blog 
  
 Given a busca do carregamento da pagina no blog  
 When eu faco a busca na pesquisa
 Then eu clico no botao pesquisa,abrirar uma outra pagina
 
 
 @fluxopadrao
 Scenario: busca de credenciado
 
 Given ao acessar funcionalidades,clica na RedeSocNet e fecha modal
 When abrir a pagina clica no botao buscar crdenciados
 Then abrir uma pagina para nova buscas
 