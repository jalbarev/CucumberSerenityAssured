Feature: Greetings Gvo edge cases (ms)
This is an example of the description of the we are testing, which allow you to break lines like
this one, which appears in another line in the report (within the feature file)

Scenario: Retrieve sucessfull greeting with MrPotato
  Given a customer calling to greeting with MrPotato
  When the service is called
  Then the service return hello MrPotato

Scenario: Retrieve sucessfull general greeting
  Given a customer calling to greeting with no name
  When the service is called
  Then the service return hello there

Scenario: Retrieve error when calling fool with MrPotato
  Given a customer calling to fool with MrPotato
  When the service is called
  Then the service return not found

@Ignore
Scenario: Example of test ignored
  Given a customer calling to greeting with no name
  When the service is called
  Then the service return not found

@Skip
Scenario: Example of test skip
  Given a customer calling to greeting with no name
  When the service is called
  Then the service return not found

