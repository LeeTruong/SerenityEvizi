package com.evizi.carhire.railinc.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

public class QueriesUI {
    public static final Target EDIT_FILTER_BUTTON = Target.the("Edit filter").locatedBy("#editFilters");
    public static final Target CHECK_BOX_EDIT_FIELD = Target.the("Check box").locatedBy("//input[@id='{0}']");
}
