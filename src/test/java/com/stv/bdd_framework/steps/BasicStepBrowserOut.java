package com.stv.bdd_framework.steps;

import io.cucumber.java.After;
import static com.stv.framework.core.drivers.Driver.getDriver;

public class BasicStepBrowserOut {
    @After(order = 1, value ="@CloseBrowser")
    public void browserClose_order1() throws Exception {
        getDriver().quit();
        System.out.println("Successes Scenario # ending");
    }
}
