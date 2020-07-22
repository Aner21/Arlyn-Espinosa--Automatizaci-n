package co.com.choucair.certification.ProyectoANER.stepdefinitions;
import co.com.choucair.certification.ProyectoANER.questions.Answer;
import co.com.choucair.certification.ProyectoANER.tasks.Login;
import co.com.choucair.certification.ProyectoANER.tasks.OpenUp;
import co.com.choucair.certification.ProyectoANER.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefintions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^tha brandom wants to learn automation at the academy Choucair$")
    public void thaBrandomWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brandom").wasAbleTo(OpenUp.thepage(), Login.OnthePage());

    }


    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseDiagramaDeParetoOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesDiagramaDePareto(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }

}
