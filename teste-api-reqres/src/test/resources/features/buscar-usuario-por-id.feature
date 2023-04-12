 Feature:  Buscar usuário por id no endpoint https://reqres.in/api/users/{id}

  Scenario: Buscar usuário a partir de um id valido
    Given que o id informado eh 1
    When eu faco uma requisicao do tipo GET para "users/{id}"
    Then o status code do response eh 200
    And o campo "data.id" eh igual a 1
    And o campo "data.email" eh igual a "george.bluth@reqres.in"
    And o campo "data.first_name" eh igual a "George"
    And o campo "data.last_name" eh igual a "Bluth"
    And o campo "data.avatar" eh igual a "https://reqres.in/img/faces/1-image.jpg"
    And  o campo "support.url" eh igual a "https://reqres.in/#support-heading"
    And o campo "support.text" eh igual a "To keep ReqRes free, contributions towards server costs are appreciated!"
