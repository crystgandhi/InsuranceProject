

Feature: User Registration Page
  User is in Insurance Registration page
  
  Background: 
    Given User lauch Chrome Browser
    And User Opens Url "https://demo.guru99.com/insurance/v1/index.php"

  @tag1
  Scenario: Registration steps
    And click register link
    And User Should see the Title as "Insurance Broker System - Register"
    When User enter title
    And user enter firstname as "John"
    And user enter surname as "Smith"
    And user enter phonenumber as "94334022453"
    And User select date
    And User select month
    And user select year
    And user select licencetype
    And user select licenceperiod
    And user enter streetName as "Appletree Dr"
    And user enter cityName as "Newyork"
    And user enter county   as "wake"
    And user enter postalcode as "27560"
    And user enter email as "johnsmith@gmail.com"
    And user enter password as "john123@2020"
    And user enter confirmpassword as "john123@2020"
    And user click submitbtn
    Then close the browser

  Scenario: Login
    Given User landed on Loginpage and get URL of the page
    When User enter loginEmail as "johnsmith@gmail.com"
    And User enter loginPassword as "john123@2020"
    And Usen click on the loginbtn
    Then User see the PageTitle as "Broker Insurance WebPage"
    Then click Logout
    Then close the browser

  @regression
  Scenario: Login Invalid Credentials
    Given User landed on Loginpage and get URL of the page
    When User enter loginEmail as "johnsmith@gmail.com"
    And User enter loginPassword as "john123@2023"
    And Usen click on the loginbtn
    And Use Should see error message as "Enter your Email address and password correct"
    Then close the browser

    @tag2
  Scenario Outline: login with credentials
  Given User landed on Loginpage and get URL of the page
  When User enter loginEmail as "<email>"
    And User enter loginPassword as "<password>"
  And Usen click on the loginbtn
  #Then User see the PageTitle as "Broker Insurance WebPage"
    

    Examples: 
      | email  | password | 
      | johnsmith@gmail.com | john123@2020 | 
      | john@gmail.com | john123@2020 | 