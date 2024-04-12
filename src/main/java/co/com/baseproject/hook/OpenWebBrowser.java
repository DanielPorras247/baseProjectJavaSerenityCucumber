package co.com.baseproject.hook;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import static co.com.baseproject.utils.Constants.WEB_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class OpenWebBrowser implements Task {

    private EnvironmentVariables enviromentVariables;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String pathURL = EnvironmentSpecificConfiguration.from(
                enviromentVariables).getProperty(WEB_URL);
        actor.attemptsTo(Open.url(pathURL));
    }

    public static Performable browserURL() {
        return instrumented(OpenWebBrowser.class);
    }
}
