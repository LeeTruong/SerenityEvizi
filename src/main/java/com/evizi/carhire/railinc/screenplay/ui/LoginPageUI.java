package com.evizi.carhire.railinc.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPageUI {
    public static final Target USERNAME_TEXTBOX = Target.the("Username input").locatedBy("#idp-discovery-username");
    public static final Target SUBMIT_BUTTON_FIRST = Target.the("Submit button first").locatedBy("#idp-discovery-submit");
    public static final Target PASSWORD_TEXTBOX = Target.the("Password input").locatedBy("#okta-signin-password");
    public static final Target SUBMIT_BUTTON_SECOND = Target.the("Submit button second").locatedBy("#okta-signin-submit");
}
