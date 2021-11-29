package com.evizi.carhire.railinc.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DashboardUI {
    public static final Target APP_CAR_HIRE_RATE = Target.the("App car hire rate").locatedBy("(//div[@class='mat-list-item-content'])[1]");
    public static final Target APP_DEPRE_MARKET = Target.the("App depre market").locatedBy("//div[text()=' Depre Market']");
    public static final Target CLOSED_OFFER_MENU = Target.the("Closed offer").locatedBy("//div[@id='closedOffersBlock']");
    public static final Target FIRST_OPEN_OFFER = Target.the("First offer").locatedBy("//*[@id='offersTable']/tbody/tr[1]/td[2]");
    public static final Target GO_BUTTON_AT_OFFER_DETAILS = Target.the("Go button at offer details").locatedBy("//input[@id='submitRespondToOffer']");
    public static final Target CONTROL_BAR_BUTTON = Target.the("Control bar button ").locatedBy("//div[@id='wizControlBar']//button[@id='{0}']");
    public static final Target BID_AND_OFFER_TEXTBOX = Target.the("Bid and offer Text box").locatedBy("//input[@id='{0}']");
    public static final Target MENU_BAR_MODULE = Target.the("Menu bar").locatedBy("//a[@id='{0}']");
    public static final Target CHARM_BUTTON = Target.the("CHAMR button").locatedBy("(//a[@id='module_support_snoop'])[1]");
}
