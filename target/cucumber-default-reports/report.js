$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmployee.feature");
formatter.feature({
  "name": "Add Employee",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add Employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@addEmployee"
    }
  ]
});
formatter.step({
  "name": "I provide \"\u003cFirstName\u003e\", \"\u003cMiddleName\u003e\", \"\u003cLastName\u003e\" and \"\u003cLocation\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I click on save button",
  "keyword": "And "
});
formatter.step({
  "name": "I see \"\u003cFirstName\u003e\", \"\u003cLastName\u003e\" is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FirstName",
        "MiddleName",
        "LastName",
        "Location"
      ]
    },
    {
      "cells": [
        "Kemal",
        "K",
        "Berk",
        "Blue Office"
      ]
    },
    {
      "cells": [
        "Elif",
        "E",
        "Zulal",
        "West Office"
      ]
    },
    {
      "cells": [
        "Zeynep",
        "Z",
        "Meral",
        "HQ"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in into OrangeHrm",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_logged_in_into_OrangeHrm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on PIM link",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_PIM_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on  Add Employee link",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_Add_Employee_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@addEmployee"
    }
  ]
});
formatter.step({
  "name": "I provide \"Kemal\", \"K\", \"Berk\" and \"Blue Office\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_provide_and(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see \"Kemal\", \"Berk\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_see_is_displayed(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in into OrangeHrm",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_logged_in_into_OrangeHrm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on PIM link",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_PIM_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on  Add Employee link",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_Add_Employee_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@addEmployee"
    }
  ]
});
formatter.step({
  "name": "I provide \"Elif\", \"E\", \"Zulal\" and \"West Office\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_provide_and(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see \"Elif\", \"Zulal\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_see_is_displayed(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in into OrangeHrm",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_logged_in_into_OrangeHrm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on PIM link",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_PIM_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on  Add Employee link",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_Add_Employee_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@addEmployee"
    }
  ]
});
formatter.step({
  "name": "I provide \"Zeynep\", \"Z\", \"Meral\" and \"HQ\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_provide_and(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see \"Zeynep\", \"Meral\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_see_is_displayed(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged in into OrangeHrm",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_logged_in_into_OrangeHrm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on PIM link",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_PIM_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on  Add Employee link",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_on_Add_Employee_link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Employee Labels Verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@temp1"
    }
  ]
});
formatter.step({
  "name": "I see following labels",
  "rows": [
    {
      "cells": [
        "First Name"
      ]
    },
    {
      "cells": [
        "Middle Name"
      ]
    },
    {
      "cells": [
        "Last Name"
      ]
    },
    {
      "cells": [
        "Employee Id"
      ]
    },
    {
      "cells": [
        "Location"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_see_following_labels(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});