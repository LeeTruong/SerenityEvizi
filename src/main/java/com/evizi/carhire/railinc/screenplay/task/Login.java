package com.evizi.carhire.railinc.screenplay.task;

import com.evizi.carhire.railinc.screenplay.model.Credentials;
import com.evizi.carhire.railinc.screenplay.ui.LoginPageUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class Login implements Task {

    private final Credentials credentials;

    public Login(Credentials credentials) {
        this.credentials = credentials;
    }

    public static Task with(Credentials credentials) {
        return Instrumented.instanceOf(Login.class).withProperties(credentials);
    }

    @Step("{0} logins with #credentials")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().thePageNamed("home.page"),
                Enter.theValue(credentials.getUsername()).into(LoginPageUI.USERNAME_TEXTBOX),
                Click.on(LoginPageUI.SUBMIT_BUTTON_FIRST),
                Enter.theValue(credentials.getPassword()).into(LoginPageUI.PASSWORD_TEXTBOX),
                Click.on(LoginPageUI.SUBMIT_BUTTON_SECOND)
        );
    }
}
