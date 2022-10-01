package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }
    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(Click.on(UTestLoginPage.JOIN_BUTTON));
    }
}
