package com.evizi.cahire.railinc.features.queries;

import com.evizi.carhire.railinc.screenplay.model.Credentials;
import com.evizi.carhire.railinc.screenplay.task.GoTo;
import com.evizi.carhire.railinc.screenplay.task.Login;
import com.evizi.carhire.railinc.screenplay.ui.QueriesUI;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class CHARM {
    @Managed
    WebDriver hisBrowser;

    @CastMember
    Actor truong = Actor.named("truong");

    @BeforeEach
    public void setUp() {
        truong.can(BrowseTheWeb.with(hisBrowser));
        truong.wasAbleTo(
                Login.with(Credentials.admin()),
                GoTo.carHireRateApplocation(),
                GoTo.CHARMScreen()
        );
    }

    @Test
    public void clear_button() throws Exception {
        truong.attemptsTo(
                GoTo.editFilter(),
                GoTo.enterValueInFieldCHARM(),
                Click.on(QueriesUI.CLEAR_BUTTON)
        );
    }
}
