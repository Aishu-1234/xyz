
Feature: Test Login
 

 
  Scenario: Login with valid data
    
    Given user launches iedriver And navigate to application url
    When user enter user name as "mercury" in user field
    When user enter password as "mercury" in password field
    When Click Signin
    Then validate login success
 