# Testes automatizados na API REQRES
Resumo: casos de testes automatizados da API Reqres, utilizando a ferramenta Cucumber e RestAssured.

### Tópicos
[Introdução](https://github.com/Natalirodriguess/testes-automatizados-reqresapi#introdu%C3%A7%C3%A3o) 

[Funcionalidades e cenários (método BDD)](https://github.com/Natalirodriguess/testes-automatizados-reqresapi#funcionalidades-e-cen%C3%A1rios-m%C3%A9todo-bdd)

## Introdução

A API Reqres, simula uma API RESTful real com endpoints e métodos de fluxos que possibilitam a realização de testes e validações das solicitações e respostas de uma API. Neste sentido, o vigente projeto conta com a automatização de alguns casos de testes que foram levantados ao explorar a API. Os testes serão automatizados utilizando as ferramentas Rest Assured, para realizar as requisições à API, JUnit 5, para executar e validar os testes em si e a ferramenta Cucumber para estruturar os testes a partir da metodologia Behavior-Driven Development (BDD).

## Funcionalidades e cenários (método BDD)

Os cenários e casos de testes serão especificados abaixo utilizando o modelo BDD e a  sintaxe Gherkin.

Feature:  Buscar usuário por id  no  endpoint https://reqres.in/api/users/{id}

    Scenario: Buscar usuário a partir de um id válido
  
    Given que o id informado é 1
    
    When eu faço uma requisição do tipo GET para users/{id}
    
    Then o status code do response é 200
    
    And o campo “data.id” é igual a 1
    
    And o campo “data.email” é igual a “george.bluth@reqres.in"
    
    And o campo “data.first_name” é igual a “George”
    
    And o campo “data.last_name” é igual a “Bluth”
    
    And o campo “data.avatar” é igual a “https://reqres.in/img/faces/1-image.jpg"
    
    And  o campo “support.url” é igual a “https://reqres.in/#support-heading”
    
    And o campo “support.text” é igual a “To keep ReqRes free, contributions towards server costs are appreciated!”


