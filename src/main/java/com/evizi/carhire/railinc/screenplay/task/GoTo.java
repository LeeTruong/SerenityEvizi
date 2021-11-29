package com.evizi.carhire.railinc.screenplay.task;

import com.evizi.carhire.railinc.screenplay.ui.DashboardUI;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoTo {

    public static Task carHireRateApplocation() {
        return Task.called("open car hire rate application").whereTheActorAttemptsTo(
                Click.on(DashboardUI.APP_CAR_HIRE_RATE)
        );
    }
}
