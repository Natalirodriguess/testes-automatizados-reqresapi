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
