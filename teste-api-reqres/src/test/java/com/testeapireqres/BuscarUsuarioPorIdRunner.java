package com.testeapireqres;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/buscar-usuario-por-id.feature")
public class BuscarUsuarioPorIdRunner {
}
