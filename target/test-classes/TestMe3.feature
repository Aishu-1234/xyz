Feature: Search Engine

  Scenario: Search engine with valid data
  
    Given User open TestMe app
    When user Signs in
    And user search for product
   Then user validate search successfully 
   
 
