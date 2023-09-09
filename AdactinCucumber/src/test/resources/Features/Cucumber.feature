Feature: verifying adactin details

  Scenario: Verifying adactin details with valid details
    Given User is on the adactin page
    When User should enter the username and password
    And User should click login button
    And User should get title and print the title
    Then User should verify the success message
