$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("JSprompt.feature");
formatter.feature({
  "line": 2,
  "name": "Confirm Click for JS prompt alert",
  "description": "",
  "id": "confirm-click-for-js-prompt-alert",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User can confirm Click for JS prompt alert",
  "description": "",
  "id": "confirm-click-for-js-prompt-alert;user-can-confirm-click-for-js-prompt-alert",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Browse to  http://the-internet.herokuapp.com Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on the JavaScript Alerts link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click on Click for JS Prompt button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Insert \"\u003cdata\u003e\" on textbox and accepts prompt alert",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify  result confirmation matches \"\u003cdata\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "confirm-click-for-js-prompt-alert;user-can-confirm-click-for-js-prompt-alert;",
  "rows": [
    {
      "cells": [
        "data"
      ],
      "line": 14,
      "id": "confirm-click-for-js-prompt-alert;user-can-confirm-click-for-js-prompt-alert;;1"
    },
    {
      "cells": [
        "abc12"
      ],
      "line": 15,
      "id": "confirm-click-for-js-prompt-alert;user-can-confirm-click-for-js-prompt-alert;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4009509000,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User can confirm Click for JS prompt alert",
  "description": "",
  "id": "confirm-click-for-js-prompt-alert;user-can-confirm-click-for-js-prompt-alert;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Browse to  http://the-internet.herokuapp.com Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on the JavaScript Alerts link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click on Click for JS Prompt button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Insert \"abc12\" on textbox and accepts prompt alert",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify  result confirmation matches \"abc12\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "JSpromptSteps.browse_to_http_the_internet_herokuapp_com_Homepage()"
});
formatter.result({
  "duration": 3196520900,
  "status": "passed"
});
formatter.match({
  "location": "JSpromptSteps.click_on_the_JavaScript_Alerts_link()"
});
formatter.result({
  "duration": 3206046900,
  "status": "passed"
});
formatter.match({
  "location": "JSpromptSteps.click_on_Click_for_JS_Prompt_button()"
});
formatter.result({
  "duration": 3072196900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc12",
      "offset": 8
    }
  ],
  "location": "JSpromptSteps.insert_on_textbox_and_accepts_prompt_alert(String)"
});
formatter.result({
  "duration": 2020479100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc12",
      "offset": 37
    }
  ],
  "location": "JSpromptSteps.verify_result_confirmation_matches(String)"
});
formatter.result({
  "duration": 39254500,
  "status": "passed"
});
formatter.after({
  "duration": 650930300,
  "status": "passed"
});
});