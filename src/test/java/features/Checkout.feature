Feature: Verify checkout details

  @Rek1
  Scenario Outline: Verify checkout details with one section empty
    When user enter username "standard_user" and password "secret_sauce"
    And user click on login button
    And add product from the product list
    And click on cart button
    And click on the checkout button
    And user enter firstname "<firstname>" and lastname "<lastname>" and zipCode "<zipCode>"
    And user click on continue button
   Then validate error message

    Examples: 
      | firstname | lastname | zipCode |
      | Ashish    | upadhyay |         |
      |           | Upadhyay |  201016 |
      | Ashish    |          |  201016 |
