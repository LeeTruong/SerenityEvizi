package com.evizi.cahire.railinc.features.dashboard;

import com.evizi.carhire.railinc.screenplay.model.Credentials;
import com.evizi.carhire.railinc.screenplay.task.GoTo;
import com.evizi.carhire.railinc.screenplay.task.Login;
import com.evizi.carhire.railinc.screenplay.ui.DashboardUI;
import com.evizi.carhire.railinc.screenplay.ui.LoginPageUI;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.thucydides.core.annotations.Managed;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class DashboardTest {

    @Managed
    WebDriver hisBrowser;

    @CastMember
    Actor truong;

    @BeforeEach
    public void setUp(){
        truong.can(BrowseTheWeb.with(hisBrowser));
        truong.wasAbleTo(
                Login.with(Credentials.admin()),
                GoTo.carHireRateApplocation()
        );
    }

    @Test
    public void copy_of_closed_offer() {
        truong.attemptsTo(
                Click.on(DashboardUI.CLOSED_OFFER_MENU),
                Click.on(DashboardUI.FIRST_OPEN_OFFER),
                Click.on(DashboardUI.GO_BUTTON_AT_OFFER_DETAILS),
                Click.on(DashboardUI.CONTROL_BAR_BUTTON.of("nextBtn")),
                Enter.theValue("OTVR").into(DashboardUI.BID_AND_OFFER_TEXTBOX.of("toScacTxt")),
                Enter.theValue("9999-12-31").into(DashboardUI.BID_AND_OFFER_TEXTBOX.of("expirationDate")),
                Enter.theValue("1234").into(DashboardUI.BID_AND_OFFER_TEXTBOX.of("referenceNumberTxt")),
                Click.on(DashboardUI.CONTROL_BAR_BUTTON.of("nextBtn"))
//                Click.on(DashboardUI.CONTROL_BAR_BUTTON.of("nextBtn"))
                // chưa fix bug on UI
//                Click.on(DashboardUI.CONTROL_BAR_BUTTON.of("submitBtn"))
        );
    }

}