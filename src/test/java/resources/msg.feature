Feature: admin credentials
  As a admin
  I want to login
  So that I can do the desired tasks


Scenario: Verifying the message

  Given admin is on home page
  When when admin enters the invalid user name "asmin" and invalid password "medic"

  Then admin should get the error message

