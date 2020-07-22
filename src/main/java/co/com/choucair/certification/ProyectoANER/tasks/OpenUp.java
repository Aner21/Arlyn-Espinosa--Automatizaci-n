package co.com.choucair.certification.ProyectoANER.tasks;

import co.com.choucair.certification.ProyectoANER.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private ChoucairAcademyPage choucairAcademyPage;

    public static OpenUp thepage() {

        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }
}
