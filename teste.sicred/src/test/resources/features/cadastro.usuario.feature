#language: pt
@teste
Funcionalidade: Adicionar usuario
  Como usuario quero acessar o site para criar uma conta 
  

  @adicionar
  Cenario: Adicionar um usuario
    Dado que selecione o bootstrap v4
    E clico em adicionar cliente
    E preencho os dados
    Quando clicar em salvar 
    Entao validamos a mensagem
    

 