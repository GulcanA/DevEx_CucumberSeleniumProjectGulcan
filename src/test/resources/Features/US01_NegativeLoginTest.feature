Feature: Negative Login Test

@smoke

  Scenario Outline: Negative Login Test Devex
    Given User is on the login page
    When The user logs in using "<username>" and "<password>" credentials
    Then The warning message contains "<message>"

    Examples:
      | username           | password   | message                                                                                  |
      | guln@gmail.com     | newjob2023 | Invalid Credentials!                                                                     |
      | gulcan             | newjob2023 | Please include an '@' in the email address. 'gulcan' is missing an '@'.                  |
      | gulcan@            | newjob2023 | Please enter a part following '@'. 'gulcan@' is incomplete.                              |
      | gulcan@@@          | newjob2023 | A part following '@' should not contain the symbol '@'.                                  |
      | gul@gmail.com      | newjob     | Invalid Credentials!                                                                     |
      |                    |           | Please fill out this field.                                                              |
      | eurotech@gmail.com | 1          | Please lengthen this text to 6 characters or more (you are currently using 1 character). |