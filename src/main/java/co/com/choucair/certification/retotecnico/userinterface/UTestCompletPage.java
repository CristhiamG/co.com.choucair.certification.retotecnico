package co.com.choucair.certification.retotecnico.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UTestCompletPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to complete").
            located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target INPUT_NAME = Target.the("where we write the name").
            located(By.xpath("//*[@id=\"firstName\"]"));
    public static final Target INPUT_LASTNAME = Target.the("where we write the last name").
            located(By.xpath("//*[@id=\"lastName\"]"));
    public static final Target INPUT_ADDRESS = Target.the("where we write the email address").
            located(By.xpath("//*[@id=\"email\"]"));
    public static final Target SELECT_MONTH = Target.the("where we select the month").
            located(By.xpath("//*[@id=\"birthMonth\"]"));
    public static final Target SELECT_DAY = Target.the("where we select the day").
            located(By.xpath("//*[@id=\"birthDay\"]"));
    public static final Target SELECT_YEAR = Target.the("where we select the year").
            located(By.xpath("//*[@id=\"birthYear\"]"));
    public static final Target ENTER_BUTTON = Target.the("button next").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
    public static final Target INPUT_CITY = Target.the("where we write the city").
            located(By.xpath("//*[@id=\"city\"]"));
    public static final Target INPUT_POSTAL = Target.the("where we write the code postal").
            located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target SELECT_COUNTRY  = Target.the("where we select the country").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target COUNTRY  = Target.the("where we select the country").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target ENTER_DEVICES = Target.the("button next").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
    public static final Target SELECT_COMPUTER = Target.the("where we select the computer").
            located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target COMPUTER = Target.the("where we select the computer").
            located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target SELECT_VERSION = Target.the("where we select the version").
            located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[2]"));
    public static final Target VERSION = Target.the("where we select the version").
            located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target SELECT_LANGUAGE = Target.the("where we select the language").
            located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[2]"));
    public static final Target LANGUAGE = Target.the("where we select the language").
            located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target SELECT_MOVILE = Target.the("where we select the movile").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span/span[1]"));
    public static final Target MOVILE = Target.the("where we select the movile").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target SELECT_MODEL = Target.the("where we select the model").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target MODEL = Target.the("where we select the model").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target SELECT_OPERATY = Target.the("where we select the operaty system").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target OPERATY = Target.the("where we select the operaty system").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target ENTER_LASTSTEP = Target.the("button next").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/i"));
    public static final Target INPUT_PASSWORD = Target.the("where we write the password").
            located(By.xpath("//*[@id=\"password\"]"));
    public static final Target INPUT_PASSWORDCONFIRM = Target.the("where we write the password confirm ").
            located(By.xpath("//*[@id=\"confirmPassword\"]"));
    public static final Target ENTER_STAY = Target.the("button stay").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target ENTER_ACEPPT = Target.the("button aceppt").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ENTER_ACEPPTPRIVACY = Target.the("button aceppt privacy").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target ENTER_COMPLETE = Target.the("button complete").
            located(By.xpath("//*[@id=\"laddaBtn\"]/span"));
}

