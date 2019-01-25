Feature: Greetings Gvo standard cases (react)
This is an example of the description of the we are testing, which allow you to break lines like
this one, which appears in another line in the report (within the feature file)

Scenario: Retrieve sucessfull greeting with MrPotato at react
  Given a customer calling to greeting with MrPotato
  When the service is called
  Then the service return hello MrPotato

  Scenario: Example of test failure
    Given a customer calling to greeting with no name
    When the service is called
    Then the service return not found


