$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("deals.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Deals Feature",
  "description": "",
  "id": "free-crm-deals-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-deals-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title of login Page is free crm",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enters the username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 6
    },
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepDefinition.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 36430029281,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.title_of_login_Page_is_free_crm()"
});
formatter.result({
  "duration": 69841057,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_enters_the_username_and_password(DataTable)"
});
formatter.result({
  "duration": 572946469,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 2142434235,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepDefinition.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 40293070594,
  "error_message": "org.openqa.selenium.NoSuchFrameException: No frame element found by name or id mainpanel\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027LT-PC-409\u0027, ip: \u002710.106.90.23\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.frame(RemoteWebDriver.java:876)\r\n\tat stepdefinition.DealsStepDefinition.user_is_on_the_home_page(DealsStepDefinition.java:56)\r\n\tat ✽.Then user is on the home page(deals.feature:9)\r\n",
  "status": "failed"
});
});