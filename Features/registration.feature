Feature: User Registration Page
  User is in Insurance Registration page

  @tag1
  Scenario: Registration steps
    Given User lauch Chrome Browser
    And User Opens Url "https://demo.guru99.com/insurance/v1/index.php"
    And click register link
    And User Should see the Title as "Insurance Broker System - Register"
    When User enter title
    And user enter firstname as "John"
    And user enter surname as "Smith"
    And user enter phonenumber as "94334022453"
    
  
