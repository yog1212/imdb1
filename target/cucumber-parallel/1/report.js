$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/imdb/src/test/resources/signin.feature");
formatter.feature({
  "name": "Verify New Account Signin in IMDB",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TV_Shows"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify New Account Signin in IMDB",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TV_Shows"
    }
  ]
});
formatter.step({
  "name": "I open \u003cBrowser\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "I go to loginURL",
  "keyword": "And "
});
formatter.step({
  "name": "User click on Signin and Create New Account with \u003cname\u003e and \u003cemail\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Browser",
        "name",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "Chrome",
        "Test",
        "Test",
        "Test"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify New Account Signin in IMDB",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TV_Shows"
    },
    {
      "name": "@TV_Shows"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open Chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to loginURL",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Signin and Create New Account with Test and Test and Test",
  "keyword": "Then "
});
formatter.match({
  "location": "GenericSteps.signin(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});