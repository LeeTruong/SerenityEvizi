package com.evizi.carhire.railinc.screenplay.task;

import com.evizi.carhire.railinc.screenplay.ui.DashboardUI;
import com.evizi.carhire.railinc.screenplay.ui.QueriesUI;
import com.evizi.carhire.railinc.screenplay.util.DateHelper;
import io.cucumber.java.DataTableType;
import io.cucumber.java.af.En;
import io.cucumber.java.an.E;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.CheckCheckbox;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class GoTo {

    public static Task carHireRateApplocation() {
        return Task.called("open car hire rate application").whereTheActorAttemptsTo(
                Click.on(DashboardUI.APP_CAR_HIRE_RATE)
        );
    }

    public static Task CHARMScreen(){
        return Task.called("Open CHARM screen").whereTheActorAttemptsTo(
                Click.on(DashboardUI.MENU_BAR_MODULE.of("module_queries")),
                Click.on(DashboardUI.CHARM_BUTTON)
        );
    }

    public static Performable editFilter(){
        return Task.called("Edit filter").whereTheActorAttemptsTo(
                Click.on(QueriesUI.EDIT_FILTER_BUTTON),
                CheckCheckbox.of(QueriesUI.CHECK_BOX_EDIT_FIELD.of("flt_bidOfferId")),
                CheckCheckbox.of(QueriesUI.CHECK_BOX_EDIT_FIELD.of("flt_carTypeCode")),
                CheckCheckbox.of(QueriesUI.CHECK_BOX_EDIT_FIELD.of("flt_userMark")),
                CheckCheckbox.of(QueriesUI.CHECK_BOX_EDIT_FIELD.of("flt_carInitial")),
                CheckCheckbox.of(QueriesUI.CHECK_BOX_EDIT_FIELD.of("flt_lessee")),
                CheckCheckbox.of(QueriesUI.CHECK_BOX_EDIT_FIELD.of("flt_carNumber")),
                CheckCheckbox.of(QueriesUI.CHECK_BOX_EDIT_FIELD.of("flt_ownerMark")),
                Click.on(QueriesUI.ACTION_BUTTON_AT_EDIT_FIELD.of("filtersSet"))
        );
    }

    public static Performable enterValueInFieldCHARM() throws Exception {
        return Task.called("Input value to field").whereTheActorAttemptsTo(
                Enter.theValue(DateHelper.getDateToDay("YYYY/MM/dd")).into(QueriesUI.FIELD_CHARM_TEXTBOX.of("charmDateLowField")),
                Enter.theValue(DateHelper.getDateToDay("YYYY/MM/dd")).into(QueriesUI.FIELD_CHARM_TEXTBOX.of("charmDateHighField")),
                Enter.theValue("234234234").into(QueriesUI.FIELD_CHARM_TEXTAREA.of("bidOfferId")),
                Enter.theValue("J3*").into(QueriesUI.FIELD_CHARM_TEXTAREA.of("carTypeCode")),
                Enter.theValue("A113").into(QueriesUI.FIELD_CHARM_TEXTAREA.of("excludeCarTypeCode")),
                Enter.theValue("BN").into(QueriesUI.FIELD_CHARM_TEXTBOX.of("carInitial")),
                Enter.theValue("0-").into(QueriesUI.FIELD_CHARM_TEXTBOX.of("carNumber")),
                Enter.theValue("BNSF").into(QueriesUI.FIELD_CHARM_TEXTBOX.of("lessee")),
//                Enter.theValue("GT").into(QueriesUI.FIELD_CHARM_TEXTBOX.of("mechDesignation")),
                Enter.theValue("BNSF").into(QueriesUI.FIELD_CHARM_TEXTBOX.of("ownerMark")),
                Enter.theValue("CSXT").into(QueriesUI.FIELD_CHARM_TEXTBOX.of("userMark"))
        );
    }
}
