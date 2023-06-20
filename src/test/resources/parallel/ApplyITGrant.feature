Feature: IT Grant Feature


  Scenario: Apply IT Grant
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Business Grants Portal"
    Then User click on Grant Login button
    And click on login in Stub corp pass page
    And click on Apply Grant
    And click on IT sector
    And select Option 1
    And select Market Readiness Assistance option
    And click on Apply button and then Proceed button
    And user enter data in eligibility page
    When user enter the details in Contact Details page
    And user enter the details in proposal details page
    And user enter the details in Business Impact page
    And user enter the details in Cost page
    And user enter the details in Declare and Review page
    Then verify Review your Application is displayed
    And check the bokx and click on Submit button
    Then verify Application has been submitted is displayed