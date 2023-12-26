Feature: Empty cart checkout 

@Reg
Scenario: Empty cart and checkout 
    When user enter username "standard_user" and password "secret_sauce"
    And user click on login button
    And add product from the product list
    And click on cart button
    And click on remove button
    And click on the checkout button
    And user enter firstname "Ashish" and lastname "Upadhyay" and zipCode "201016"
    And user click on continue button
    And user click on Finish button
    Then validate successful message
    
