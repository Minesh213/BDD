Feature: Nopcommerce Registration

  Background:
    Given User able to open browser
    And Enter Url
  Scenario: Nopcommerce Valid register Test
    Then User click on Register Link
    Then User click to select gender Male Or Female
    When User enter firstname and lastname
    Then User Date of birth
    Then User enter valid Email
    Then  User enter company Name
    Then User unclick newsletter
    Then user enter password and confirm password again
    Then user click to register button
