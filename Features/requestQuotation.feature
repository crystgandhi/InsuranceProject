Feature: Request A Quotation for Insuracne Broker system

  Scenario: Title of your scenario
    Given User lauch Chrome Browser
    And User Opens Url "https://demo.guru99.com/insurance/v1/index.php"
    When User enter loginEmail as "johnsmith@gmail.com"
    And User enter loginPassword as "john123@2020"
    And Usen click on the loginbtn
    Then User see the PageTitle as "Broker Insurance WebPage"
    When User click on requestQuotation link
    Then User should see the title as "Request a quotation"
    And User can see "polciyexcess-16%
    When user select BreakdownCover
    Then User can see "Windscreenrepair"
    When User select windscreen repairtype
    Then user can see "ExcessPaid"
    And User can see "vehicle" text
    When User enter all insurance Info
    Then User calculate Premium
    And User can get Premium Amount
    Then User can save the quotation
    Then User should get Identification Number
    Then close the browser

  Scenario: Retrieve Quotation with wrong identification Number
    Given User is in "https://demo.guru99.com/insurance/v1/header.php"
    When User click retrieveQuotation link
    And User enter "identification number"
    And user click retrieve button
    Then User can see the message as "Wrong Retrieve Quotation ID. Please Check..."
    
    Scenario: Retrieve Quotation with Coreect identification Number
    Given User is in "https://demo.guru99.com/insurance/v1/header.php"
    When User click retrieveQuotation link
    And User enter "identification number"
    And user click retrieve button
    Then User can see the title as "Retrieve Quotation"
    And User can get Estimated value
    And User can get Start of Policy date
    
        
    