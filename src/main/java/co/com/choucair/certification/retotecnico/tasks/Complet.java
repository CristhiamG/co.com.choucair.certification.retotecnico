package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UTestCompletPage;
import com.ibm.icu.util.TimeUnit;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;

import java.sql.Time;

public class Complet implements Task {

    public static Complet onThePage() {
        return Tasks.instrumented(Complet.class);
    }
    @Override
    public <T extends Actor> void performAs (T actor){
            actor.attemptsTo((Performable) Click.on(UTestCompletPage.JOIN_BUTTON),
                    Enter.theValue("Isaac").into(UTestCompletPage.INPUT_NAME),
                    Enter.theValue("Garcia").into(UTestCompletPage.INPUT_LASTNAME),
                    Enter.theValue("ypg22@gmail.com").into(UTestCompletPage.INPUT_ADDRESS),
                    SelectFromOptions.byVisibleText("April").from(UTestCompletPage.SELECT_MONTH),
                    SelectFromOptions.byVisibleText("27").from(UTestCompletPage.SELECT_DAY),
                    SelectFromOptions.byVisibleText("1995").from(UTestCompletPage.SELECT_YEAR),
                    Click.on(UTestCompletPage.ENTER_BUTTON),
                    Enter.theValue("Cucuta").into(UTestCompletPage.INPUT_CITY),
                    Hit.the(Keys.ARROW_DOWN).into(UTestCompletPage.INPUT_CITY),
                    Hit.the(Keys.ENTER).into(UTestCompletPage.INPUT_CITY),
                    Enter.theValue("540001").into(UTestCompletPage.INPUT_POSTAL),
                    Click.on(UTestCompletPage.SELECT_COUNTRY),
                    Enter.theValue("Colombia").into(UTestCompletPage.COUNTRY),
                    Click.on(UTestCompletPage.ENTER_DEVICES),
                    Click.on(UTestCompletPage.SELECT_COMPUTER),
                    Enter.theValue("Window").into(UTestCompletPage.COMPUTER),
                    Click.on(UTestCompletPage.SELECT_VERSION),
                    Enter.theValue("Windows 11").into(UTestCompletPage.VERSION),
                    Hit.the(Keys.ARROW_DOWN).into(UTestCompletPage.VERSION),
                    Hit.the(Keys.ARROW_UP).into(UTestCompletPage.VERSION),
                    Hit.the(Keys.ENTER).into(UTestCompletPage.VERSION),
                    Click.on(UTestCompletPage.SELECT_LANGUAGE),
                    Enter.theValue("Spanish").into(UTestCompletPage.LANGUAGE),
                    Hit.the(Keys.ARROW_DOWN).into(UTestCompletPage.LANGUAGE),
                    Hit.the(Keys.ENTER).into(UTestCompletPage.LANGUAGE),
                    Click.on(UTestCompletPage.SELECT_MOVILE),
                    Enter.theValue("Apple").into(UTestCompletPage.MOVILE),
                    Hit.the(Keys.ARROW_DOWN).into(UTestCompletPage.MOVILE),
                    Hit.the(Keys.ENTER).into(UTestCompletPage.MOVILE),
                    Click.on(UTestCompletPage.SELECT_MODEL),
                    Enter.theValue("iPhone 12 Pro Max").into(UTestCompletPage.MODEL),
                    Hit.the(Keys.ARROW_DOWN).into(UTestCompletPage.MODEL),
                    Hit.the(Keys.ENTER).into(UTestCompletPage.MODEL),
                    Click.on(UTestCompletPage.SELECT_OPERATY),
                    Enter.theValue("iOS 16.0.2").into(UTestCompletPage.OPERATY),
                    Hit.the(Keys.ARROW_DOWN).into(UTestCompletPage.OPERATY),
                    Hit.the(Keys.ENTER).into(UTestCompletPage.OPERATY),
                    Click.on(UTestCompletPage.ENTER_LASTSTEP),
                    Enter.theValue("95042713687Cc").into(UTestCompletPage.INPUT_PASSWORD),
                    Enter.theValue("95042713687Cc").into(UTestCompletPage.INPUT_PASSWORDCONFIRM),
                    Click.on(UTestCompletPage.ENTER_STAY),
                    Click.on(UTestCompletPage.ENTER_ACEPPT),
                    Click.on(UTestCompletPage.ENTER_ACEPPTPRIVACY),
                    Click.on(UTestCompletPage.ENTER_COMPLETE));
    }
}
