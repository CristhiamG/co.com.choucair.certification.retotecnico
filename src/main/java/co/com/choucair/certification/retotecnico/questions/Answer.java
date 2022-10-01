package co.com.choucair.certification.retotecnico.questions;

import co.com.choucair.certification.retotecnico.userinterface.UTestCompletPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answer implements Question<Boolean> {
    private String question;
    public Answer(String question){
        this.question = question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameiscorrect = Text.of(UTestCompletPage.ENTER_COMPLETE).viewedBy(actor).asString();
        String question="Complete Setup";
        if(question.equals(nameiscorrect)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
