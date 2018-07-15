$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/RT/eclipse-workspace/BDD/src/main/java/Features/JIRA.feature");
formatter.feature({
  "line": 1,
  "name": "JIRA Ticket Creation",
  "description": "",
  "id": "jira-ticket-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create a Formatting ticket in JIRA",
  "description": "",
  "id": "jira-ticket-creation;create-a-formatting-ticket-in-jira",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on JIRA homepage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "clicks on Create button to create JIRA ticket",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters information for JIRA ticket",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user creates JIRA ticket",
  "keyword": "Then "
});
formatter.match({
  "location": "creatingFormattingTicket.user_opens_browser()"
});
formatter.result({
  "duration": 16118987281,
  "status": "passed"
});
formatter.match({
  "location": "creatingFormattingTicket.user_is_on_JIRA_homepage()"
});
formatter.result({
  "duration": 15096364,
  "status": "passed"
});
formatter.match({
  "location": "creatingFormattingTicket.enters_username_and_password()"
});
formatter.result({
  "duration": 7720712363,
  "status": "passed"
});
formatter.match({
  "location": "creatingFormattingTicket.user_clicks_on_Submit_button()"
});
formatter.result({
  "duration": 8056570979,
  "status": "passed"
});
formatter.match({
  "location": "creatingFormattingTicket.clicks_on_Create_button_to_create_JIRA_ticket()"
});
formatter.result({
  "duration": 403628483,
  "status": "passed"
});
formatter.match({
  "location": "creatingFormattingTicket.user_enters_information_for_JIRA_ticket()"
});
formatter.result({
  "duration": 53963854852,
  "status": "passed"
});
formatter.match({
  "location": "creatingFormattingTicket.user_creates_JIRA_ticket()"
});
formatter.result({
  "duration": 36592,
  "status": "passed"
});
});