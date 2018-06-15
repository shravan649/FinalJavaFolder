$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Features"
    }
  ],
  "line": 2,
  "name": "feature description",
  "description": "In order to do something\r\nAs someone\r\nI want something else to happen",
  "id": "feature-description",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "scenario description",
  "description": "",
  "id": "feature-description;scenario-description",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "a precondition is valid",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "an action is performed",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "something should be asserted",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});