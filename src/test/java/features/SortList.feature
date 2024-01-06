Feature: Add to cart in swag labs

  @Rek
  Scenario: Add everything to the cart
    When user enter username "standard_user" and password "secret_sauce"
    And user click on login button
    And click on sort list
    Then validate element of list