Feature: Logout functionality of swag labs

  @Rek
  Scenario: verify the logout functionality is working
  When user enter username "standard_user" and password "secret_sauce"
  And user click on login button
  And click on ham burger button
  And validate presence of element
  And click on the logout button
  Then validate the logout 