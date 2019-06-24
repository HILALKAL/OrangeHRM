#Author: syntax team     //john.smith@wellfargo.com
Feature: Add Employee

  Background: 
    Given I logged in into OrangeHrm
    And I click on PIM link
    And I click on  Add Employee link

  @smoke @addEmployee
  Scenario Outline: Add Employee
    When I provide "<FirstName>", "<MiddleName>", "<LastName>" and "<Location>" 
    And I click on save button
    Then I see "<FirstName>", "<LastName>" is displayed

    Examples: 
      | FirstName | MiddleName | LastName | Location    |
      | Kemal     | K          | Berk     | Blue Office |
      | Elif      | E          | Zulal    | West Office |
      | Zeynep    | Z          | Meral    | HQ          |

 

  @temp1
  Scenario: Add Employee Labels Verification
    Then I see following labels
      | First Name  |
      | Middle Name |
      | Last Name   |
      | Employee Id |
      | Location    |
