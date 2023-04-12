package com.testeapireqres.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.equalTo;


class BuscarUsuarioPorIdSteps {

	String id;
	Response response;
	@Given("que o id informado eh {int}")
	public void que_o_id_informado_eh(Integer id) {
		this.id = String.valueOf(id);
	}
	@When("eu faco uma requisicao do tipo GET para {string}")
	public void eu_faco_uma_requisicao_do_tipo_get_para(String endPoint) {
		RestAssured.baseURI = "https://reqres.in/api";
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.header("Content-Type","application/json" );
		this.response = requestSpecification.get(endPoint.replace("{id}", this.id));
	}
	@Then("o status code do response eh {int}")
	public void o_status_code_do_response_eh(Integer statusCode) {
		this.response.then().statusCode(statusCode);

	}
	@Then("o campo {string} eh igual a {int}")
	public void o_campo_eh_igual_a(String campo, Integer valor) {
		this.response.then().body(campo, equalTo(valor));

	}
	@Then("o campo {string} eh igual a {string}")
	public void o_campo_eh_igual_a(String campo, String valorCampo){
		this.response.then().body(campo,equalTo(valorCampo));
	}
}
