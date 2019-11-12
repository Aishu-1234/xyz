Feature: TestMe Login

  Scenario: TestMe Login with valid data
    Given User logs in to TestMe app
    When  user clicks on sign in button
    And   user enters username
    And   user enters the password
    And    user clicks on login button
    Then  user validates login successfull
   


