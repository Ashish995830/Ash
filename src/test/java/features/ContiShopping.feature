Feature: Contiune shopping fucttionality

  @Reg
  Scenario: Verify the contiune shopping button is working
    When user enter username "standard_user" and password "secret_sauce"
    And user click on login button
    And add product from the product list
    And click on cart button
    And click on contiune shopping button
    Then validate the cart page 