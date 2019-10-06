Feature: Access Gmail mailbox
  Scenario: Verify accessing gmail from google chrome browser
    Given A chrome browser
    When I access gmail URL
    Then I see gmail page prompting for username and password