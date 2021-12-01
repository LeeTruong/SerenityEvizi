package com.evizi.carhire.railinc.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

public class QueriesUI {
    public static final Target EDIT_FILTER_BUTTON = Target.the("Edit filter").locatedBy("#editFilters");
    public static final Target CHECK_BOX_EDIT_FIELD = Target.the("Check box").locatedBy("//input[@id='{0}']");
    public static final Target FIELD_CHARM_TEXTBOX = Target.the("Input field").locatedBy("//input[@id='{0}']");
    public static final Target FIELD_CHARM_TEXTAREA = Target.the("Input field").locatedBy("//textarea[@id='{0}']");
    public static final Target ACTION_BUTTON_AT_EDIT_FIELD = Target.the("Action button").locatedBy("//button[@id='{0}']");
    public static final Target CLEAR_BUTTON = Target.the("Clear button").locatedBy("#charmQryClearBtn");
}
