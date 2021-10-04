Feature: Customer

  Scenario: Add  new Customer
    Given User Launch Chrome browser
    When User Opens URL " https://admin-demo.nopcommerce.com/login"
    And User Enter Email as "admin@yourstore.com" and password as"admin"
    And Click on Login
    Then User can view deshbroad
    When User click on customer minu
    And click on customers minu item
    And click on add new button
    Then user can view add view customer page
    When user enter customer info
    And click on save button
    Then user can view confirmation message "The new customer has been added successfully. "
    And close browser
