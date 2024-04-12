package co.com.baseproject.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class OpenWebStepDefinition {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @When("ingresa al sitio web de pruebas")
    public void EnterTheWebSite() {

    }
    @Then("visualizara en el titulo de la pagina {string}")
    public void WillBeDisplayedOnTheTitlePage(String string) {

    }
}
