#Author: Karina Araujo


Feature: Preencher formulario no site da grocerycrud
  Eu como usuario quero acessar o site para criar uma conta

  
  Scenario: Adicionar usuario
    Given que eu entre no site da grocerycrud "https://www.grocerycrud.com/v1.x/demo/bootstrap_theme"
    And selecione o bootstrap v4
    And clico em add customer
    And preencho os dados do formulario
    When clicar em salvar
    Then validamos a mensagem
    

 