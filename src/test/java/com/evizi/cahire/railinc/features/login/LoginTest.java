package com.evizi.cahire.railinc.features.login;

import com.evizi.carhire.railinc.screenplay.model.Credentials;
import com.evizi.carhire.railinc.screenplay.task.Login;
import com.evizi.carhire.railinc.screenplay.ui.DashboardUI;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.SingleBrowser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

@ExtendWith(SerenityJUnit5Extension.class)
@SingleBrowser
public class LoginTest {

    @Managed
    WebDriver hisBrowser;

    @CastMember
    Actor truong;

    @BeforeEach
    public void setUp() {
        truong.can(BrowseTheWeb.with(hisBrowser));
    }

    @Test
    public void login_pass() {
        truong.attemptsTo(
                Login.with(Credentials.admin()),
                Ensure.that(DashboardUI.APP_CAR_HIRE_RATE.waitingForNoMoreThan(Duration.ofSeconds(15))).isDisplayed(),
                Ensure.that(DashboardUI.APP_DEPRE_MARKET.waitingForNoMoreThan(Duration.ofSeconds(15))).isDisplayed()
        );
    }
}
