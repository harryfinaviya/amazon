

Feature:

  Scenario:

    Given I enter url as "https://www.amazon.co.uk"
    When  I click on signin button
    Given I enter email as "fsgfdsg"
    Given I enter password as "password"
    When I click on signin button
    Then  I should see my Account