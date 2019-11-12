Feature: TestMe app registration

  Scenario: TestMe app registration with valid data
  
    Given User opens TestMe application
    When  user clicks on sign up button
    And   user enters user name
    And   user enters firstname
    And   user enters lastname
    And   user enters password
    And   user enters confirm password
    And   user selects gender
    And   user enters email
    And   user enters mobile number
    And   user selects DOB
    And   user enters address
    And   user selects security question
    And   user enters answer 
    And   user clicks on register button
    Then  user validates registration page successfully

