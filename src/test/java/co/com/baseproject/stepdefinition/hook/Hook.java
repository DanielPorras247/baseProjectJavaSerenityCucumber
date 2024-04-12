package co.com.baseproject.stepdefinition.hook;

import co.com.baseproject.hook.OpenWebBrowser;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;

import static co.com.baseproject.utils.Constants.TIME_SHORT;
import static co.com.baseproject.utils.Constants.TITLE;
import static co.com.baseproject.utils.Time.waiting;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hook {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que {string} abre el navegador")
    public void OpenTheWebBrowser(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                OpenWebBrowser.browserURL()
        );
        waiting(TIME_SHORT);
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(TITLE)
                )
        );

    }
}
