#Author: your.email@your.domain.com
Feature: Job Title

@db
  Scenario Outline: Job Title Validation
    Given I logged into OrangeHrm
    And I click on Admin Link
    And I click on Job Link
    When I click on Job Titles
    And I get all Job Titles from UI
    And I execute "<SqlQuery>"
    Then I see results from UI and Database are matched

    Examples: 
      | SqlQuery                              |
      | SELECT JOB_TITLE FROM JOBS ORDER BY 1 |
