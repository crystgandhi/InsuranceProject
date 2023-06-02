Feature: Login DataDriven
  
  @tag2
  Scenario Outline: login with credentials
  Given User lauch Chrome Browser
  And User Opens Url "https://demo.guru99.com/insurance/v1/index.php"
  Given User landed on Loginpage and get URL of the page
  When User enter loginEmail as <email>
    And User enter loginPassword as <password>
  And Usen click on the loginbtn
  Then User see the PageTitle as "Broker Insurance WebPage"
    

    Examples: 
      | email  | password | 
      | johnsmith@gmail.com | john123@2020 | 
      | john@gmail.com | john123@2020 | 
