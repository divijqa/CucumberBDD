Feature: user succesfully Signup to Facebook
     This feature files consists of Signup Teststeps

  Scenario: verify user able to suuccessfully logins to Facebook
    Given user is in Facebook.com
    When user enters First name and Last Name
    When User eneters mobile number or Email-id
    When user re enters email-id
    When uesr enters password
    When user enters date of birth
    When user clicks on sex male or female
    Then I validate the outcomes
