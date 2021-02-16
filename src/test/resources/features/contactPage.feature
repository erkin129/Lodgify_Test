@Contact
Feature: Contact feature

  Scenario: contact form without input
    #Given User is on the Lodgify pricing page
    When User navigate to Contact Page
    And User click on "Send message" button
    Then User should see Error message

  Scenario: contact form with input
      #Given User is on the Lodgify pricing page
    When User navigate to Contact Page
    And User fill out the form with following information
      | firstname | arkin            |
      | lastname  | yakup            |
      | email     | benton@gmail.com |
      | phone_    | United Kingdom   |
      | phone-    | 9646565645       |
      | number    | 3                |
      | main      | Website          |
      | language  | english          |

    And User should type message in message field
    And User should check the I have read and agree to the Privacy Policy check box



