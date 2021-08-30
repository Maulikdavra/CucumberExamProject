$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/AddData.feature");
formatter.feature({
  "line": 2,
  "name": "validate Techfios Final Exam login functionality",
  "description": "",
  "id": "validate-techfios-final-exam-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ColorFeature"
    }
  ]
});
formatter.before({
  "duration": 2767537800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "Given: User is on the Techfios final exam page",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 7,
  "name": "1 User should able to change color as per test case",
  "description": "",
  "id": "validate-techfios-final-exam-login-functionality;1-user-should-able-to-change-color-as-per-test-case",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User should be able to set sky blue Background color",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should be able to set White Background color",
  "keyword": "And "
});
formatter.match({
  "location": "AppDataTest.user_should_be_able_to_set_sky_blue_Background_color()"
});
formatter.result({
  "duration": 2157804800,
  "status": "passed"
});
formatter.match({
  "location": "AppDataTest.user_should_be_able_to_set_White_Background_color()"
});
formatter.result({
  "duration": 90283500,
  "status": "passed"
});
});