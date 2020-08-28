Feature: 
  		Verify different GET operations

  Scenario: Verify one author of the post
    Given I perform GET operation for "/post"
    And I perform GET for the post numebr "1"
    Then I should see the author name as "Steve French"
