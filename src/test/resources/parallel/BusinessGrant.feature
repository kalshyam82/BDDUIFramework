Feature: Business Grant feature


Scenario: Verify HomePage title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Business Grants Portal"

  Scenario: Verify Apply Grant is displayed
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Business Grants Portal"
    Then User click on Grant Login button
    And click on login in Stub corp pass page
    Then verify Apply Grant panel is displayed




