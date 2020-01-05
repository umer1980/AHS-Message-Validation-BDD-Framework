Feature: admin credentials
  As a admin
  I want to login
  So that I can do the desired tasks


  Scenario Outline: Login with invalid credentials

    Given admin is on home page
    When  admin enters the "<username>" and "<password>"

    Then admin should get the error message "<message>"
    Examples:
    |username|password |          message                |
    |asmin   | medic   |  Invalid user name              |
    |admin   | meedic  |  invalid User Name              |
    | ADMIN  |  MEDIC  |  Invalid username and password  |
    | AdMiN  |  MeDiC  |  Invalid username and password  |
    | aDmIn  |  mEdIc  |  Invalid username and password  |
