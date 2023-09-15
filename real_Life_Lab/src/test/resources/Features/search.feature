Feature: Search the product
 
  Scenario: search the product from excel sheet
    Given a user is on the landing page
    When he click login button
    And he writes product name 
    And he clicks on search button
    Then he must be able to verify the product "Delivery date:"
    
    
