Feature: Facebook Search

 Scenario: Login and validate username and password for facebook

  
  
    Given user is entering facebook.com
    When user is typing username and password and validate
    And click the login button
    Then the user should quit the browser


