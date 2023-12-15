Feature: Add to cart

  @Reg
  Scenario: Add to cart from product page
    When user enter username "standard_user" and password "secret_sauce"
    And user click on login button
    And add product from the product list
    Then validate the cart add number

