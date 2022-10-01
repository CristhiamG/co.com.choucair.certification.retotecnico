package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.questions.Answer;
import co.com.choucair.certification.retotecnico.tasks.Complet;
import co.com.choucair.certification.retotecnico.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class UTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^that Cristhiam wants to fill out a form in utest$")
    public void thatCristhiamWantsToFillOutAFormInUtest() {
        OnStage.theActorCalled("Cristhiam").wasAbleTo(OpenUp.thePage());
    }


    @When("^he wants to enter his personal data and register$")
    public void heWantsToEnterHisPersonalDataAndRegister() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenUp.thePage(),Complet.onThePage());
    }

    @Then("^complete all the personal data in order to create a user(.*)$")
    public void completeAllThePersonalDataInOrderToCreateAUser(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
