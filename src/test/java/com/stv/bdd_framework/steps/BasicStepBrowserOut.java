package com.stv.bdd_framework.steps;

import io.cucumber.java.After;
import static com.stv.framework.core.drivers.Driver.getDriver;

public class BasicStepBrowserOut {
    @After(order = 1, value ="@MainPageFeature")
    public void browserClose_order1() throws Exception {
        getDriver().quit();
        System.out.println("Successes Scenario: 01 ending");
    }
    @After(order = 2, value ="@LoginAndAccountPageFeature")
    public void browserClose_order2() throws Exception {
        getDriver().quit();
        System.out.println("Successes Scenario: 02 ending");
    }
    @After(order = 3, value ="@NewCustomerRegFallFeature")
    public void browserClose_order3() throws Exception {
        getDriver().quit();
        System.out.println("Successes Scenario: 03 ending");
    }
    @After(order = 4, value ="@PersonalTaskFeature")
    public void browserClose_order4() throws Exception {
        getDriver().quit();
        System.out.println("Successes Scenario: 04 ending");
    }
}
