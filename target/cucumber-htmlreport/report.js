$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EntryAd.feature");
formatter.feature({
  "line": 2,
  "name": "Entry Ad",
  "description": "",
  "id": "entry-ad",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 4392594400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "close the popup window.",
  "description": "",
  "id": "entry-ad;close-the-popup-window.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User Browses to http://the-internet.herokuapp.com",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User navigates to Entry Ad",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on close button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify Display message \"Entry Ad\"",
  "keyword": "Then "
});
formatter.match({
  "location": "EntryAdSteps.user_Browses_to_http_the_internet_herokuapp_com()"
});
formatter.result({
  "duration": 3311415100,
  "status": "passed"
});
formatter.match({
  "location": "EntryAdSteps.user_navigates_to_Entry_Ad()"
});
formatter.result({
  "duration": 2329793400,
  "status": "passed"
});
formatter.match({
  "location": "EntryAdSteps.user_clicks_on_close_button()"
});
formatter.result({
  "duration": 3064917900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Entry Ad",
      "offset": 24
    }
  ],
  "location": "EntryAdSteps.verify_Display_message(String)"
});
formatter.result({
  "duration": 38124400,
  "status": "passed"
});
formatter.after({
  "duration": 677933300,
  "status": "passed"
});
formatter.uri("FileDownload.feature");
formatter.feature({
  "line": 2,
  "name": "File Download",
  "description": "",
  "id": "file-download",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 3286547100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User is able to Download a PNG File",
  "description": "",
  "id": "file-download;user-is-able-to-download-a-png-file",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Browse to the internet home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Click on File Download",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Click on text document module",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User can verify File has been downloaded Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "FileDownloadSteps.browse_to_the_internet_home_page()"
});
formatter.result({
  "duration": 3010256900,
  "status": "passed"
});
formatter.match({
  "location": "FileDownloadSteps.user_Click_on_File_Download()"
});
formatter.result({
  "duration": 2270585500,
  "status": "passed"
});
formatter.match({
  "location": "FileDownloadSteps.user_Click_on_text_document_module()"
});
formatter.result({
  "duration": 2181016800,
  "status": "passed"
});
formatter.match({
  "location": "FileDownloadSteps.user_can_verify_File_has_been_downloaded_Successfully()"
});
formatter.result({
  "duration": 2001292700,
  "status": "passed"
});
formatter.after({
  "duration": 734856300,
  "status": "passed"
});
formatter.uri("FileUpload.feature");
formatter.feature({
  "line": 2,
  "name": "File Upload",
  "description": "",
  "id": "file-upload",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 3230028400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User able to upload a file",
  "description": "",
  "id": "file-upload;user-able-to-upload-a-file",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Browse to \"https://the-internet.herokuapp.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on File Upload",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on Choose File",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click upload button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify file has been uploaded",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://the-internet.herokuapp.com/",
      "offset": 11
    }
  ],
  "location": "FileUploadSteps.browse_to(String)"
});
formatter.result({
  "duration": 2990610500,
  "status": "passed"
});
formatter.match({
  "location": "FileUploadSteps.click_on_File_Upload()"
});
formatter.result({
  "duration": 2542196500,
  "status": "passed"
});
formatter.match({
  "location": "FileUploadSteps.click_on_Choose_File()"
});
formatter.result({
  "duration": 2072826200,
  "status": "passed"
});
formatter.match({
  "location": "FileUploadSteps.click_upload_button()"
});
formatter.result({
  "duration": 2530143400,
  "status": "passed"
});
formatter.match({
  "location": "FileUploadSteps.verify_file_has_been_uploaded()"
});
formatter.result({
  "duration": 2109140500,
  "status": "passed"
});
formatter.after({
  "duration": 728394200,
  "status": "passed"
});
formatter.uri("HorizontalSlider.feature");
formatter.feature({
  "line": 3,
  "name": "Horizontal Slider",
  "description": "",
  "id": "horizontal-slider",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 3365174900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User can slide the slider horizontally",
  "description": "",
  "id": "horizontal-slider;user-can-slide-the-slider-horizontally",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User browses to The Internet homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User navigates to the horizontal slider module",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Set the slider by sliding it horizontally",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user can see the value he is indicating to",
  "keyword": "Then "
});
formatter.match({
  "location": "HorizontalSliderSteps.user_browses_to_The_Internet_homepage()"
});
formatter.result({
  "duration": 3142963400,
  "status": "passed"
});
formatter.match({
  "location": "HorizontalSliderSteps.user_navigates_to_the_horizontal_slider_module()"
});
formatter.result({
  "duration": 2253701000,
  "status": "passed"
});
formatter.match({
  "location": "HorizontalSliderSteps.set_the_slider_by_sliding_it_horizontally()"
});
formatter.result({
  "duration": 2413280300,
  "status": "passed"
});
formatter.match({
  "location": "HorizontalSliderSteps.user_can_see_the_value_he_is_indicating_to()"
});
formatter.result({
  "duration": 35781700,
  "status": "passed"
});
formatter.after({
  "duration": 1472627800,
  "status": "passed"
});
formatter.uri("JSalert.feature");
formatter.feature({
  "line": 2,
  "name": "Confirm JS Alert",
  "description": "",
  "id": "confirm-js-alert",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 3183930700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User will be able to confirm JS Alert",
  "description": "",
  "id": "confirm-js-alert;user-will-be-able-to-confirm-js-alert",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Browse to the internet.herokuapp website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on the JavaScript Alert module",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on Click for JS alert button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on Ok button to confirm",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify that alert button is sucessfully accepted",
  "keyword": "Then "
});
formatter.match({
  "location": "JSalertSteps.browse_to_the_internet_herokuapp_website()"
});
formatter.result({
  "duration": 2868839000,
  "status": "passed"
});
formatter.match({
  "location": "JSalertSteps.click_on_the_JavaScript_Alert_module()"
});
formatter.result({
  "duration": 3226361900,
  "status": "passed"
});
formatter.match({
  "location": "JSalertSteps.click_on_Click_for_JS_alert_button()"
});
formatter.result({
  "duration": 66212600,
  "status": "passed"
});
formatter.match({
  "location": "JSalertSteps.click_on_Ok_button_to_confirm()"
});
formatter.result({
  "duration": 3019910800,
  "status": "passed"
});
formatter.match({
  "location": "JSalertSteps.verify_that_alert_button_is_sucessfully_accepted()"
});
formatter.result({
  "duration": 41571600,
  "status": "passed"
});
formatter.after({
  "duration": 662392300,
  "status": "passed"
});
formatter.uri("JSconfirm.feature");
formatter.feature({
  "line": 3,
  "name": "Confirm Click for JS confirm alert",
  "description": "",
  "id": "confirm-click-for-js-confirm-alert",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 3321424300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User can accept confirm alert",
  "description": "",
  "id": "confirm-click-for-js-confirm-alert;user-can-accept-confirm-alert",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user browses to https://the-internet.herokuapp.com homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user clicks on JavaScript Alerts link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on JS Confirm button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user click on Ok button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user will be able to verify results for click for JS Confirm",
  "keyword": "Then "
});
formatter.match({
  "location": "JSconfirmSteps.user_browses_to_https_the_internet_herokuapp_com_homepage()"
});
formatter.result({
  "duration": 3004422100,
  "status": "passed"
});
formatter.match({
  "location": "JSconfirmSteps.user_clicks_on_JavaScript_Alerts_link()"
});
formatter.result({
  "duration": 3224385800,
  "status": "passed"
});
formatter.match({
  "location": "JSconfirmSteps.user_clicks_on_JS_Confirm_button()"
});
formatter.result({
  "duration": 3056514300,
  "status": "passed"
});
formatter.match({
  "location": "JSconfirmSteps.user_click_on_Ok_button()"
});
formatter.result({
  "duration": 3009998900,
  "status": "passed"
});
formatter.match({
  "location": "JSconfirmSteps.user_will_be_able_to_verify_results_for_click_for_JS_Confirm()"
});
formatter.result({
  "duration": 2044920600,
  "status": "passed"
});
formatter.after({
  "duration": 703455700,
  "status": "passed"
});
formatter.uri("JSprompt.feature");
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
  "duration": 3227470100,
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
  "duration": 3193387800,
  "status": "passed"
});
formatter.match({
  "location": "JSpromptSteps.click_on_the_JavaScript_Alerts_link()"
});
formatter.result({
  "duration": 3258937900,
  "status": "passed"
});
formatter.match({
  "location": "JSpromptSteps.click_on_Click_for_JS_Prompt_button()"
});
formatter.result({
  "duration": 3080782800,
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
  "duration": 2025802900,
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
  "duration": 49798400,
  "status": "passed"
});
formatter.after({
  "duration": 669743800,
  "status": "passed"
});
formatter.uri("JSpromptCancel.feature");
formatter.feature({
  "line": 2,
  "name": "Cancel Click for JS prompt alert",
  "description": "",
  "id": "cancel-click-for-js-prompt-alert",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 3177355800,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User can cancel Click for JS prompt alert",
  "description": "",
  "id": "cancel-click-for-js-prompt-alert;user-can-cancel-click-for-js-prompt-alert",
  "type": "scenario",
  "keyword": "Scenario"
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
  "name": "Dismiss prompt alert",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify  result confirmation is null",
  "keyword": "Then "
});
formatter.match({
  "location": "JSpromptSteps.browse_to_http_the_internet_herokuapp_com_Homepage()"
});
formatter.result({
  "duration": 3242618000,
  "status": "passed"
});
formatter.match({
  "location": "JSpromptSteps.click_on_the_JavaScript_Alerts_link()"
});
formatter.result({
  "duration": 3289712800,
  "status": "passed"
});
formatter.match({
  "location": "JSpromptSteps.click_on_Click_for_JS_Prompt_button()"
});
formatter.result({
  "duration": 3059242600,
  "status": "passed"
});
formatter.match({
  "location": "JSpromptCancelSteps.dismiss_prompt_alert()"
});
formatter.result({
  "duration": 8857900,
  "status": "passed"
});
formatter.match({
  "location": "JSpromptCancelSteps.verify_result_confirmation_is_null()"
});
formatter.result({
  "duration": 45130300,
  "status": "passed"
});
formatter.after({
  "duration": 700086800,
  "status": "passed"
});
formatter.uri("RetrievePassword.feature");
formatter.feature({
  "line": 3,
  "name": "Retrieve forgotten password",
  "description": "",
  "id": "retrieve-forgotten-password",
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
  "name": "User can retrieve a password by entering his email",
  "description": "",
  "id": "retrieve-forgotten-password;user-can-retrieve-a-password-by-entering-his-email",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Browses to the internet home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Clicks on the forgot password module",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter \"\u003cemail\u003e\" and click on retrieve password button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user will get a confirmation message",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "retrieve-forgotten-password;user-can-retrieve-a-password-by-entering-his-email;",
  "rows": [
    {
      "cells": [
        "email"
      ],
      "line": 12,
      "id": "retrieve-forgotten-password;user-can-retrieve-a-password-by-entering-his-email;;1"
    },
    {
      "cells": [
        "abc@aol.com"
      ],
      "line": 13,
      "id": "retrieve-forgotten-password;user-can-retrieve-a-password-by-entering-his-email;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3253849800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User can retrieve a password by entering his email",
  "description": "",
  "id": "retrieve-forgotten-password;user-can-retrieve-a-password-by-entering-his-email;;2",
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
  "name": "Browses to the internet home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Clicks on the forgot password module",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter \"abc@aol.com\" and click on retrieve password button",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user will get a confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "RetrievePasswordSteps.browses_to_the_internet_home_page()"
});
formatter.result({
  "duration": 2962455000,
  "status": "passed"
});
formatter.match({
  "location": "RetrievePasswordSteps.clicks_on_the_forgot_password_module()"
});
formatter.result({
  "duration": 2386870500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc@aol.com",
      "offset": 7
    }
  ],
  "location": "RetrievePasswordSteps.enter_and_click_on_retrieve_password_button(String)"
});
formatter.result({
  "duration": 2607040000,
  "status": "passed"
});
formatter.match({
  "location": "RetrievePasswordSteps.user_will_get_a_confirmation_message()"
});
formatter.result({
  "duration": 2029402500,
  "status": "passed"
});
formatter.after({
  "duration": 669688900,
  "status": "passed"
});
});